/**
 * Problem 1971
 * 
 * @param {number} n
 * @param {number[][]} edges
 * @param {number} source
 * @param {number} destination
 * @return {boolean}
 */
var validPath = function (n, edges, source, destination) {
    let hasPath = false
    let graph = new Map()
    let visited = new Set()

    for (const [v, e] of edges) {
        if (graph.has(v)) {
            graph.get(v).push(e)
        } else {
            graph.set(v, [e])
        }

        if (graph.has(e)) {
            graph.get(e).push(v)
        } else {
            graph.set(e, [v])
        }
    }
    
    function dfs(graph, node, visited = new Set()) {
        if (visited.has(node)) return;

        visited.add(node);

        if (graph.size > 0) {
            for (let neighbourhood of graph.get(node)) {
                dfs(graph, neighbourhood, visited);
            }
        }

    }

    dfs(graph, source, visited)

    return visited.has(destination)
};
