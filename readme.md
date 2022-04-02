Discussion
1. How did you represent the social network? Why did you choose this representation?

The social network was represented as a graph where each node represents a user and each edge represents a connection(friendship) between two users.
I chose this representation because it makes it easier to represent relations between each user and would allow for adding other relationship types in the future if needed.
Also, the graph allows for easy access to each user and their friends.

2. What algorithm did you use to compute the shortest chain of friends? What alternatives did you consider? Why did you choose this algorithm over the alternatives?

I used Breadth-First-Search to compute the shortest chain of friends. As alternatives, I considered a Depth-First-Search algorithm to parse through the graph. However, DFS would only find a path from the start node to the destination node, which is not necessarily the shortest path. 
Also, using DFS, two users could be only one degree of separation from each other, but DFS would search through all the nodes in their subtrees before finding the connection which would be very inefficient.

3. Please enumerate the test cases you considered and explain their relevance.

I considered the following test cases:
    * The starting node, and the destination node be the same.
    * Having no path between the starting node and the destination node.
    * Having a cyclic graph as an input in order to check if the algorithm would function correctly by only visiting the friend nodes that have not already been visited.
    * Test cases for adding users to the list of friends of one user or to the social network(adding the same user twice or user adding himself as a friend).
