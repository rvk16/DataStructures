# Complete DSA Interview Preparation Guide
## Algorithms, Learning Path & 8-Week Schedule

---

# TABLE OF CONTENTS

1. [Prerequisites Before Starting](#part-1-prerequisites)
2. [Complete Algorithm Reference](#part-2-complete-algorithm-reference)
3. [Pattern-Based Problem Solving](#part-3-pattern-based-problem-solving)
4. [8-Week Detailed Study Plan](#part-4-8-week-study-plan)
5. [Company-Wise Most Asked Problems](#part-5-company-wise-most-asked-problems)

---
# PART 1: PREREQUISITES

## Before You Start DSA, Make Sure You Know:

### 1. Built-in Data Structures
| Structure | Java Class | Key Operations |
|-----------|------------|----------------|
| Dynamic Array | ArrayList | add, get, remove, size |
| Linked List | LinkedList | addFirst, addLast, removeFirst |
| Stack | Stack / Deque | push, pop, peek |
| Queue | Queue / LinkedList | offer, poll, peek |
| Deque | ArrayDeque | addFirst, addLast, pollFirst, pollLast |
| Hash Map | HashMap | put, get, containsKey, remove |
| Hash Set | HashSet | add, contains, remove |
| Tree Map | TreeMap | put, get, firstKey, lastKey |
| Tree Set | TreeSet | add, first, last, ceiling, floor |
| Heap | PriorityQueue | offer, poll, peek |

### 2. Big O Notation
| Notation | Name | Example |
|----------|------|---------|
| O(1) | Constant | Array access, HashMap get |
| O(log n) | Logarithmic | Binary Search |
| O(n) | Linear | Linear Search, Single Loop |
| O(n log n) | Linearithmic | Merge Sort, Quick Sort |
| O(n²) | Quadratic | Nested Loops, Bubble Sort |
| O(2ⁿ) | Exponential | Recursive Fibonacci |
| O(n!) | Factorial | Permutations |

### 3. Recursion Basics
- Base case and recursive case
- Call stack understanding
- Converting iteration to recursion and vice versa

---

# PART 2: COMPLETE ALGORITHM REFERENCE

## Priority Legend
- 🔴 **Must Know** — Very frequently asked, implement from scratch
- 🟡 **Should Know** — Moderately asked, understand concept well
- 🟢 **Good to Know** — Less frequent, can give you an edge

---

## 1. SORTING ALGORITHMS

| Algorithm | Time (Best) | Time (Avg) | Time (Worst) | Space | Stable? | Priority |
|-----------|-------------|------------|--------------|-------|---------|----------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes | 🟢 |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No | 🟢 |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | Yes | 🟡 |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes | 🔴 |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | No | 🔴 |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | No | 🟡 |
| Counting Sort | O(n + k) | O(n + k) | O(n + k) | O(k) | Yes | 🟡 |
| Radix Sort | O(nk) | O(nk) | O(nk) | O(n + k) | Yes | 🟢 |
| Bucket Sort | O(n + k) | O(n + k) | O(n²) | O(n) | Yes | 🟢 |
| Tim Sort | O(n) | O(n log n) | O(n log n) | O(n) | Yes | 🟢 |

### When to Use Which Sorting Algorithm?
| Scenario | Best Algorithm | Why |
|----------|---------------|-----|
| General purpose | Quick Sort | Fast average case, in-place |
| Stable sort needed | Merge Sort | Guaranteed stable, O(n log n) |
| Nearly sorted data | Insertion Sort | O(n) for nearly sorted |
| Limited memory | Heap Sort | O(1) extra space |
| Small range integers | Counting Sort | O(n) when range is small |
| Linked List sorting | Merge Sort | No random access needed |
| External sorting (large files) | Merge Sort | Sequential access pattern |

### Key Interview Points for Sorting:
- Java's `Arrays.sort()` uses Dual-Pivot QuickSort for primitives, TimSort for objects
- Know the difference between stable and unstable sorts
- Understand when O(n²) algorithms are actually better (small n, nearly sorted)

---

## 2. SEARCHING ALGORITHMS

| Algorithm | Time (Best) | Time (Avg) | Time (Worst) | Space | Priority |
|-----------|-------------|------------|--------------|-------|----------|
| Linear Search | O(1) | O(n) | O(n) | O(1) | 🔴 |
| Binary Search | O(1) | O(log n) | O(log n) | O(1) | 🔴 |
| Ternary Search | O(1) | O(log₃ n) | O(log₃ n) | O(1) | 🟢 |
| Jump Search | O(1) | O(√n) | O(√n) | O(1) | 🟢 |
| Interpolation Search | O(1) | O(log log n) | O(n) | O(1) | 🟢 |
| Exponential Search | O(1) | O(log n) | O(log n) | O(1) | 🟢 |

### Binary Search Variations (All 🔴 Must Know)
| Variation | Use Case |
|-----------|----------|
| Standard Binary Search | Find exact element |
| Lower Bound (First Occurrence) | Find first position of element |
| Upper Bound (Last Occurrence) | Find last position of element |
| Search Insert Position | Find where element should be inserted |
| Search in Rotated Array | Array rotated at some pivot |
| Find Peak Element | Find local maximum |
| Binary Search on Answer | Optimization problems (min/max feasible) |
| Search in 2D Matrix | Row-wise and column-wise sorted |

### When to Apply Binary Search?
- Array is sorted (or can be sorted)
- Search space can be halved with each decision
- Monotonic property exists (if X works, all > X work OR all < X work)
- Looking for min/max that satisfies a condition

---

## 3. ARRAY ALGORITHMS

| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| Kadane's Algorithm | O(n) | O(1) | 🔴 | Maximum subarray sum |
| Dutch National Flag | O(n) | O(1) | 🔴 | Sort array with 3 distinct values |
| Boyer-Moore Voting | O(n) | O(1) | 🔴 | Find majority element |
| Prefix Sum | O(n) | O(n) | 🔴 | Range sum queries |
| Two Pointers | O(n) | O(1) | 🔴 | Pair finding, partitioning |
| Sliding Window | O(n) | O(k) | 🔴 | Subarray/substring problems |
| Reservoir Sampling | O(n) | O(k) | 🟡 | Random sampling from stream |
| Fisher-Yates Shuffle | O(n) | O(1) | 🟡 | Random permutation |
| Quick Select | O(n) avg | O(1) | 🔴 | Find kth element |
| Moore's Algorithm | O(n) | O(1) | 🟡 | Majority element (>n/3) |

### Kadane's Algorithm Variants
| Variant | Problem |
|---------|---------|
| Basic | Maximum Subarray Sum |
| With indices | Return start and end indices |
| Circular array | Maximum Sum Circular Subarray |
| Product variant | Maximum Product Subarray |
| 2D variant | Maximum Sum Rectangle in 2D Matrix |

### Matrix Algorithms
| Algorithm | Priority | Use Case |
|-----------|----------|----------|
| Spiral Traversal | 🔴 | Print matrix in spiral order |
| Rotate 90° (Transpose + Reverse) | 🔴 | Rotate image |
| Set Matrix Zeroes | 🔴 | Mark rows/cols as zero |
| Diagonal Traversal | 🟡 | Traverse diagonally |
| Search in 2D Matrix | 🔴 | Binary search in sorted matrix |
| Island Problems (DFS/BFS) | 🔴 | Count/measure connected components |

---

## 4. STRING ALGORITHMS

| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| Two Pointers | O(n) | O(1) | 🔴 | Palindrome, reverse |
| Sliding Window | O(n) | O(k) | 🔴 | Substring problems |
| KMP (Knuth-Morris-Pratt) | O(n + m) | O(m) | 🟡 | Pattern matching |
| Rabin-Karp | O(n + m) avg | O(1) | 🟡 | Pattern matching with hashing |
| Z-Algorithm | O(n + m) | O(n) | 🟢 | Pattern matching |
| Manacher's Algorithm | O(n) | O(n) | 🟢 | Longest palindromic substring |
| Trie Operations | O(m) | O(ALPHABET × m × n) | 🔴 | Prefix matching |
| Rolling Hash | O(n) | O(1) | 🟡 | Substring hashing |

### String Pattern Matching Comparison
| Algorithm | Preprocessing | Matching | Best For |
|-----------|---------------|----------|----------|
| Brute Force | O(1) | O(nm) | Short strings |
| KMP | O(m) | O(n) | Single pattern |
| Rabin-Karp | O(m) | O(n) avg | Multiple patterns |
| Boyer-Moore | O(m + k) | O(n/m) best | Long patterns |

---

## 5. LINKED LIST ALGORITHMS

| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| Floyd's Cycle Detection | O(n) | O(1) | 🔴 | Detect cycle, find cycle start |
| Reverse Linked List | O(n) | O(1) | 🔴 | Reverse entire or portion |
| Merge Two Sorted Lists | O(n + m) | O(1) | 🔴 | Merge sort helper |
| Find Middle (Fast/Slow) | O(n) | O(1) | 🔴 | Split list in half |
| Remove Nth from End | O(n) | O(1) | 🔴 | Two pointer with gap |
| Intersection Point | O(n + m) | O(1) | 🟡 | Find where lists meet |
| Merge K Sorted Lists | O(n log k) | O(k) | 🔴 | Heap-based merge |

### Floyd's Cycle Detection Applications
| Problem | Approach |
|---------|----------|
| Detect Cycle | Fast catches slow |
| Find Cycle Start | Reset slow to head after meeting |
| Find Duplicate in Array | Treat values as next pointers |
| Happy Number | Number sequence forms cycle |

---

## 6. STACK ALGORITHMS

| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| Monotonic Stack | O(n) | O(n) | 🔴 | Next greater/smaller element |
| Expression Evaluation | O(n) | O(n) | 🔴 | Infix, postfix calculations |
| Parentheses Matching | O(n) | O(n) | 🔴 | Valid parentheses |
| Stock Span | O(n) | O(n) | 🟡 | Days since price was lower |
| Largest Rectangle | O(n) | O(n) | 🔴 | Histogram area |

### Monotonic Stack Variations
| Type | Finds | Stack Contains |
|------|-------|----------------|
| Increasing (bottom to top) | Next Smaller Element | Decreasing sequence |
| Decreasing (bottom to top) | Next Greater Element | Increasing sequence |

### Problems Using Monotonic Stack
- Next Greater Element (I, II, circular)
- Daily Temperatures
- Largest Rectangle in Histogram
- Maximal Rectangle
- Trapping Rain Water (stack approach)
- Remove K Digits
- Sum of Subarray Minimums

---

## 7. QUEUE ALGORITHMS

| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| BFS (using Queue) | O(V + E) | O(V) | 🔴 | Level-order, shortest path |
| Sliding Window Maximum | O(n) | O(k) | 🔴 | Deque-based max in window |
| Circular Queue | O(1) | O(n) | 🟡 | Fixed size buffer |
| Priority Queue Operations | O(log n) | O(n) | 🔴 | Top K, scheduling |

---

## 8. HEAP / PRIORITY QUEUE ALGORITHMS

| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| Build Heap | O(n) | O(1) | 🔴 | Heapify array |
| Heap Push | O(log n) | O(1) | 🔴 | Insert element |
| Heap Pop | O(log n) | O(1) | 🔴 | Extract min/max |
| Top K Elements | O(n log k) | O(k) | 🔴 | K largest/smallest |
| K-Way Merge | O(n log k) | O(k) | 🔴 | Merge K sorted lists |
| Two Heaps | O(log n) | O(n) | 🔴 | Median finder |
| Heap Sort | O(n log n) | O(1) | 🟡 | In-place sorting |

### Heap Pattern Recognition
| Problem Type | Heap Type | Why |
|--------------|-----------|-----|
| K Largest elements | Min Heap of size K | Keep K largest, poll smallest |
| K Smallest elements | Max Heap of size K | Keep K smallest, poll largest |
| Median in stream | Max Heap + Min Heap | Balance two halves |
| Merge K sorted | Min Heap | Always get smallest |
| Task Scheduling | Max Heap | Prioritize frequent tasks |

---

## 9. TREE ALGORITHMS

### Tree Traversals
| Traversal | Order | Priority | Use Case |
|-----------|-------|----------|----------|
| Preorder | Root → Left → Right | 🔴 | Copy tree, prefix expression |
| Inorder | Left → Root → Right | 🔴 | BST sorted order |
| Postorder | Left → Right → Root | 🔴 | Delete tree, postfix expression |
| Level Order (BFS) | Level by level | 🔴 | Level-wise problems |
| Morris Traversal | O(1) space inorder | 🟡 | Space-optimized traversal |
| Vertical Order | Column by column | 🟡 | Vertical traversal |

### Binary Search Tree Operations
| Operation | Time (Balanced) | Time (Skewed) | Priority |
|-----------|-----------------|---------------|----------|
| Search | O(log n) | O(n) | 🔴 |
| Insert | O(log n) | O(n) | 🔴 |
| Delete | O(log n) | O(n) | 🟡 |
| Find Min/Max | O(log n) | O(n) | 🔴 |
| Validate BST | O(n) | O(n) | 🔴 |
| LCA in BST | O(log n) | O(n) | 🔴 |
| Kth Smallest | O(h + k) | O(n) | 🔴 |

### Tree Algorithms
| Algorithm | Time | Priority | Use Case |
|-----------|------|----------|----------|
| LCA (Binary Tree) | O(n) | 🔴 | Find common ancestor |
| Diameter of Tree | O(n) | 🔴 | Longest path |
| Maximum Path Sum | O(n) | 🔴 | Max sum any path |
| Serialize/Deserialize | O(n) | 🔴 | Store/restore tree |
| Tree from Traversals | O(n) | 🔴 | Construct from pre+in/post+in |
| Balanced Tree Check | O(n) | 🔴 | Check height balance |
| Tree DP | O(n) | 🟡 | Optimization on trees |

---

## 10. GRAPH ALGORITHMS

### Traversal Algorithms
| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| BFS | O(V + E) | O(V) | 🔴 | Shortest path (unweighted), level order |
| DFS | O(V + E) | O(V) | 🔴 | Connectivity, cycle detection, paths |
| Iterative DFS | O(V + E) | O(V) | 🔴 | Same as DFS, avoid stack overflow |

### Shortest Path Algorithms
| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| BFS | O(V + E) | O(V) | 🔴 | Unweighted graphs |
| Dijkstra's | O((V+E) log V) | O(V) | 🔴 | Non-negative weights |
| Bellman-Ford | O(V × E) | O(V) | 🟡 | Negative weights, detect negative cycles |
| Floyd-Warshall | O(V³) | O(V²) | 🟡 | All pairs shortest path |
| A* Search | O(E) | O(V) | 🟢 | Heuristic-guided search |

### Minimum Spanning Tree
| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| Kruskal's | O(E log E) | O(V) | 🟡 | Sparse graphs |
| Prim's | O((V+E) log V) | O(V) | 🟡 | Dense graphs |

### Other Graph Algorithms
| Algorithm | Time | Space | Priority | Use Case |
|-----------|------|-------|----------|----------|
| Topological Sort (Kahn's BFS) | O(V + E) | O(V) | 🔴 | Dependency ordering |
| Topological Sort (DFS) | O(V + E) | O(V) | 🟡 | Alternative approach |
| Cycle Detection (Directed) | O(V + E) | O(V) | 🔴 | DFS with colors |
| Cycle Detection (Undirected) | O(V + E) | O(V) | 🔴 | Union-Find or DFS |
| Union-Find | O(α(n)) | O(V) | 🔴 | Connected components |
| Tarjan's SCC | O(V + E) | O(V) | 🟢 | Strongly connected components |
| Kosaraju's SCC | O(V + E) | O(V) | 🟢 | Strongly connected components |
| Bridges & Articulation Points | O(V + E) | O(V) | 🟢 | Critical edges/nodes |
| Bipartite Check | O(V + E) | O(V) | 🟡 | 2-colorable graph |

### When to Use Which Graph Algorithm?
| Scenario | Algorithm |
|----------|-----------|
| Shortest path in unweighted graph | BFS |
| Shortest path with positive weights | Dijkstra |
| Shortest path with negative weights | Bellman-Ford |
| All pairs shortest path | Floyd-Warshall |
| Detect cycle in directed graph | DFS with 3 colors |
| Detect cycle in undirected graph | Union-Find or DFS |
| Task dependencies | Topological Sort |
| Connected components | Union-Find or DFS |
| Minimum cost to connect all | MST (Kruskal/Prim) |

---

## 11. DYNAMIC PROGRAMMING PATTERNS

### DP Patterns Overview
| Pattern | Priority | Example Problems |
|---------|----------|------------------|
| Fibonacci/Linear | 🔴 | Climbing Stairs, House Robber |
| 0/1 Knapsack | 🔴 | Partition Equal Subset Sum, Target Sum |
| Unbounded Knapsack | 🔴 | Coin Change, Rod Cutting |
| Longest Common Subsequence | 🔴 | LCS, Edit Distance |
| Longest Increasing Subsequence | 🔴 | LIS, Russian Dolls |
| Grid/Matrix DP | 🔴 | Unique Paths, Min Path Sum |
| String DP | 🔴 | Word Break, Palindrome |
| Interval DP | 🟡 | Burst Balloons, Matrix Chain |
| State Machine DP | 🟡 | Stock Buy/Sell series |
| Bitmask DP | 🟢 | TSP, Assignment Problem |
| Digit DP | 🟢 | Count numbers with property |
| Tree DP | 🟡 | Max path in tree |

### How to Approach DP Problems
```
Step 1: Identify if it's a DP problem
- Optimal substructure (optimal solution uses optimal sub-solutions)
- Overlapping subproblems (same subproblems solved multiple times)

Step 2: Define the state
- What parameters define a unique subproblem?
- Example: dp[i] = max profit ending at index i

Step 3: Write the recurrence relation
- How does current state depend on previous states?
- Example: dp[i] = max(dp[i-1], dp[i-2] + nums[i])

Step 4: Identify base cases
- Smallest subproblems with known answers
- Example: dp[0] = nums[0], dp[1] = max(nums[0], nums[1])

Step 5: Decide iteration order
- Bottom-up: smaller subproblems first
- Top-down: memoization with recursion

Step 6: Optimize space if possible
- Often can reduce from O(n) to O(1) or O(n²) to O(n)
```

### Stock Buy/Sell Variants
| Problem | Transactions | Cooldown | Fee | Key Idea |
|---------|--------------|----------|-----|----------|
| Stock I | 1 | No | No | Track min price |
| Stock II | Unlimited | No | No | Sum all profits |
| Stock III | 2 | No | No | Two buy-sell states |
| Stock IV | K | No | No | Generalize Stock III |
| Stock with Cooldown | Unlimited | Yes | No | 3 states: hold, sold, reset |
| Stock with Fee | Unlimited | No | Yes | Subtract fee on sell |

---

## 12. BACKTRACKING ALGORITHMS

| Pattern | Priority | Example Problems |
|---------|----------|------------------|
| Subsets | 🔴 | Subsets I, II |
| Permutations | 🔴 | Permutations I, II |
| Combinations | 🔴 | Combinations, Combination Sum I-IV |
| Partition | 🔴 | Palindrome Partitioning |
| Grid Search | 🔴 | Word Search I, II |
| Constraint Satisfaction | 🟡 | N-Queens, Sudoku Solver |

### Backtracking Template Understanding
```
1. Define the goal state (when to add to result)
2. Define choices at each step
3. Define constraints (when to skip/prune)
4. Make choice → Recurse → Undo choice
```

### Key Backtracking Problems
| Category | Problems |
|----------|----------|
| Generate All | Subsets, Permutations, Combinations |
| Partition | Palindrome Partition, Partition to K Equal Sum |
| Grid | Word Search, N-Queens, Sudoku |
| String | Letter Combinations, Generate Parentheses |

---

## 13. GREEDY ALGORITHMS

| Algorithm | Priority | Example Problems |
|-----------|----------|------------------|
| Activity Selection | 🔴 | Meeting Rooms, Non-overlapping Intervals |
| Fractional Knapsack | 🟡 | Max value with fractional items |
| Huffman Coding | 🟢 | Optimal prefix codes |
| Job Scheduling | 🟡 | Task Scheduler, Job Sequencing |
| Interval Scheduling | 🔴 | Merge Intervals, Insert Interval |

### When Greedy Works
- Problem has optimal substructure
- Greedy choice property: local optimum leads to global optimum
- No need to reconsider previous choices

### Common Greedy Problems
- Jump Game I, II
- Gas Station
- Task Scheduler
- Partition Labels
- Merge Intervals
- Meeting Rooms II
- Queue Reconstruction by Height

---

## 14. BIT MANIPULATION

### Basic Operations
| Operation | Code | Description |
|-----------|------|-------------|
| Check bit | `(n >> i) & 1` | Is bit i set? |
| Set bit | `n | (1 << i)` | Set bit i to 1 |
| Clear bit | `n & ~(1 << i)` | Set bit i to 0 |
| Toggle bit | `n ^ (1 << i)` | Flip bit i |
| Check power of 2 | `n > 0 && (n & (n-1)) == 0` | Only one bit set |
| Count set bits | `Integer.bitCount(n)` | Number of 1s |
| Get lowest set bit | `n & (-n)` | Isolate rightmost 1 |
| Clear lowest set bit | `n & (n-1)` | Remove rightmost 1 |

### XOR Properties (Very Important!)
| Property | Explanation |
|----------|-------------|
| a ^ a = 0 | XOR with self is 0 |
| a ^ 0 = a | XOR with 0 is same |
| a ^ b ^ a = b | XOR is self-inverse |
| Commutative | a ^ b = b ^ a |
| Associative | (a ^ b) ^ c = a ^ (b ^ c) |

### Bit Manipulation Problems
| Problem | Trick Used |
|---------|------------|
| Single Number | XOR all elements |
| Missing Number | XOR indices and values |
| Power of Two | n & (n-1) == 0 |
| Counting Bits | dp[i] = dp[i >> 1] + (i & 1) |
| Sum of Two Integers | XOR for sum, AND for carry |
| Reverse Bits | Shift and build |

---

## 15. MATHEMATICAL ALGORITHMS

| Algorithm | Time | Priority | Use Case |
|-----------|------|----------|----------|
| GCD (Euclidean) | O(log min(a,b)) | 🔴 | Greatest common divisor |
| LCM | O(log min(a,b)) | 🔴 | Least common multiple |
| Sieve of Eratosthenes | O(n log log n) | 🟡 | All primes up to n |
| Prime Factorization | O(√n) | 🟡 | Factor into primes |
| Fast Exponentiation | O(log n) | 🟡 | Compute a^n efficiently |
| Modular Arithmetic | O(1) | 🔴 | Large number computations |
| Pascal's Triangle | O(n²) | 🟡 | Combinations (nCr) |
| Matrix Exponentiation | O(k³ log n) | 🟢 | Fibonacci in O(log n) |

### Modular Arithmetic Rules
| Operation | Formula |
|-----------|---------|
| Addition | (a + b) % m = ((a % m) + (b % m)) % m |
| Subtraction | (a - b) % m = ((a % m) - (b % m) + m) % m |
| Multiplication | (a × b) % m = ((a % m) × (b % m)) % m |
| Division | (a / b) % m = (a × b^(-1)) % m (need modular inverse) |

---

## 16. INTERVAL ALGORITHMS

| Algorithm | Time | Priority | Use Case |
|-----------|------|----------|----------|
| Merge Intervals | O(n log n) | 🔴 | Combine overlapping |
| Insert Interval | O(n) | 🔴 | Insert and merge |
| Interval Intersection | O(n + m) | 🟡 | Find overlapping parts |
| Meeting Rooms Check | O(n log n) | 🔴 | Check if can attend all |
| Meeting Rooms II | O(n log n) | 🔴 | Min rooms needed |
| Non-overlapping Count | O(n log n) | 🔴 | Max non-overlapping |

### Interval Problem Approach
1. Usually sort by start time (or end time for scheduling)
2. Process intervals one by one
3. Track current/previous interval state
4. Use heap for room allocation problems

---

## 17. TRIE (PREFIX TREE)

| Operation | Time | Priority |
|-----------|------|----------|
| Insert | O(m) | 🔴 |
| Search | O(m) | 🔴 |
| StartsWith | O(m) | 🔴 |
| Delete | O(m) | 🟡 |

### Trie Applications
- Autocomplete/Typeahead
- Spell checker
- IP routing (longest prefix match)
- Word games (Boggle)
- Pattern matching with wildcards

### Trie Problems
- Implement Trie
- Design Add and Search Words
- Word Search II
- Replace Words
- Maximum XOR of Two Numbers

---

## 18. UNION-FIND (DISJOINT SET)

| Operation | Time (with optimizations) | Priority |
|-----------|---------------------------|----------|
| Find | O(α(n)) ≈ O(1) | 🔴 |
| Union | O(α(n)) ≈ O(1) | 🔴 |
| Connected | O(α(n)) ≈ O(1) | 🔴 |

### Union-Find Optimizations
| Optimization | Benefit |
|--------------|---------|
| Path Compression | Flatten tree during find |
| Union by Rank | Attach smaller tree under larger |
| Union by Size | Similar to rank |

### Union-Find Applications
- Connected components
- Cycle detection in undirected graph
- Kruskal's MST
- Redundant Connection
- Accounts Merge
- Number of Islands (alternative to DFS)

---

# PART 3: PATTERN-BASED PROBLEM SOLVING

## How to Identify Patterns

| If the problem mentions... | Think about... |
|---------------------------|----------------|
| "Sorted array" | Binary Search, Two Pointers |
| "Subarray" or "Substring" | Sliding Window, Prefix Sum |
| "Contiguous" | Kadane's, Sliding Window |
| "Maximum/Minimum subarray" | Kadane's Algorithm |
| "Pair", "Triplet", "Sum" | Two Pointers, HashMap |
| "Palindrome" | Two Pointers, DP |
| "Parentheses", "Brackets" | Stack |
| "Next Greater/Smaller" | Monotonic Stack |
| "Top K", "Kth largest" | Heap |
| "Frequency" | HashMap, Heap |
| "Shortest path" | BFS (unweighted), Dijkstra (weighted) |
| "All paths", "All possibilities" | Backtracking, DFS |
| "Dependencies", "Prerequisites" | Topological Sort |
| "Connected", "Components" | Union-Find, DFS |
| "Tree" | DFS, BFS, Recursion |
| "Optimization" (min/max) | DP, Greedy |
| "Count ways" | DP |
| "Subsequence" | DP (LCS, LIS) |
| "Prefix" | Trie, Prefix Sum |
| "Range queries" | Segment Tree, Prefix Sum |
| "Cycle detection" | Floyd's, DFS, Union-Find |
| "Intervals", "Meetings" | Sorting + Greedy |
| "Matrix", "Grid" | BFS, DFS, DP |
| "Level by level" | BFS |

---

# PART 4: 8-WEEK STUDY PLAN

## Week Overview

| Week | Focus Area | Daily Time | Weekend Time |
|------|------------|------------|--------------|
| Week 1 | Arrays, Strings, Two Pointers | 2-3 hours | 4-5 hours |
| Week 2 | Sliding Window, Binary Search | 2-3 hours | 4-5 hours |
| Week 3 | Linked Lists, Stacks, Queues | 2-3 hours | 4-5 hours |
| Week 4 | Trees (BFS, DFS, BST) | 2-3 hours | 4-5 hours |
| Week 5 | Graphs, Union-Find | 2-3 hours | 4-5 hours |
| Week 6 | Heaps, Backtracking | 2-3 hours | 4-5 hours |
| Week 7 | Dynamic Programming | 3-4 hours | 5-6 hours |
| Week 8 | Mixed Practice, Mock Interviews | 3-4 hours | 5-6 hours |

---

# PART 5: COMPANY-WISE MOST ASKED PROBLEMS

## Amazon Top 30

| # | Problem | Difficulty | Pattern |
|---|---------|------------|---------|
| 1 | Two Sum | Easy | HashMap |
| 2 | LRU Cache | Medium | Design |
| 3 | Number of Islands | Medium | Graph DFS |
| 4 | Merge Two Sorted Lists | Easy | Linked List |
| 5 | Valid Parentheses | Easy | Stack |
| 6 | Reverse Linked List | Easy | Linked List |
| 7 | Maximum Subarray | Medium | Kadane's |
| 8 | Longest Substring Without Repeating | Medium | Sliding Window |
| 9 | 3Sum | Medium | Two Pointers |
| 10 | Merge Intervals | Medium | Intervals |
| 11 | Search in Rotated Sorted Array | Medium | Binary Search |
| 12 | Word Break | Medium | DP |
| 13 | Binary Tree Level Order | Medium | BFS |
| 14 | Trapping Rain Water | Hard | Two Pointers/Stack |
| 15 | Coin Change | Medium | DP |
| 16 | Top K Frequent Elements | Medium | Heap |
| 17 | Word Ladder | Hard | BFS |
| 18 | Sliding Window Maximum | Hard | Monotonic Deque |
| 19 | Min Stack | Medium | Design |
| 20 | Validate BST | Medium | Tree DFS |
| 21 | Course Schedule | Medium | Topological Sort |
| 22 | Kth Largest Element | Medium | Heap/QuickSelect |
| 23 | Serialize and Deserialize Binary Tree | Hard | Tree |
| 24 | Meeting Rooms II | Medium | Heap/Intervals |
| 25 | Add Two Numbers | Medium | Linked List |
| 26 | Group Anagrams | Medium | HashMap |
| 27 | Word Search | Medium | Backtracking |
| 28 | Longest Palindromic Substring | Medium | DP |
| 29 | Merge K Sorted Lists | Hard | Heap |
| 30 | Design In-Memory File System | Hard | Design/Trie |

## Google Top 30

| # | Problem | Difficulty | Pattern |
|---|---------|------------|---------|
| 1 | Longest Substring Without Repeating | Medium | Sliding Window |
| 2 | Median of Two Sorted Arrays | Hard | Binary Search |
| 3 | Container With Most Water | Medium | Two Pointers |
| 4 | 3Sum | Medium | Two Pointers |
| 5 | Letter Combinations of Phone Number | Medium | Backtracking |
| 6 | Valid Parentheses | Easy | Stack |
| 7 | Merge K Sorted Lists | Hard | Heap |
| 8 | Trapping Rain Water | Hard | Two Pointers |
| 9 | Maximum Subarray | Medium | Kadane's |
| 10 | Jump Game | Medium | DP/Greedy |
| 11 | Merge Intervals | Medium | Intervals |
| 12 | Unique Paths | Medium | DP |
| 13 | Word Search | Medium | Backtracking |
| 14 | Word Break | Medium | DP |
| 15 | LRU Cache | Medium | Design |
| 16 | Number of Islands | Medium | Graph DFS |
| 17 | Course Schedule | Medium | Topological Sort |
| 18 | Implement Trie | Medium | Trie |
| 19 | Find Median from Data Stream | Hard | Two Heaps |
| 20 | Serialize and Deserialize Binary Tree | Hard | Tree |
| 21 | Meeting Rooms II | Medium | Heap |
| 22 | Alien Dictionary | Hard | Topological Sort |
| 23 | Decode Ways | Medium | DP |
| 24 | Longest Increasing Subsequence | Medium | DP |
| 25 | Robot Room Cleaner | Hard | DFS |
| 26 | Maximum Product Subarray | Medium | DP |
| 27 | Split Array Largest Sum | Hard | Binary Search |
| 28 | Minimum Window Substring | Hard | Sliding Window |
| 29 | Daily Temperatures | Medium | Monotonic Stack |
| 30 | Pacific Atlantic Water Flow | Medium | Graph DFS |

## Facebook/Meta Top 30

| # | Problem | Difficulty | Pattern |
|---|---------|------------|---------|
| 1 | Valid Palindrome | Easy | Two Pointers |
| 2 | Merge Intervals | Medium | Intervals |
| 3 | Subarray Sum Equals K | Medium | Prefix Sum |
| 4 | Binary Tree Maximum Path Sum | Hard | Tree DFS |
| 5 | Minimum Window Substring | Hard | Sliding Window |
| 6 | Lowest Common Ancestor | Medium | Tree |
| 7 | Random Pick with Weight | Medium | Binary Search |
| 8 | Add Strings | Easy | Math |
| 9 | Valid Palindrome II | Easy | Two Pointers |
| 10 | Move Zeroes | Easy | Two Pointers |
| 11 | Product of Array Except Self | Medium | Prefix |
| 12 | Clone Graph | Medium | Graph BFS/DFS |
| 13 | Diameter of Binary Tree | Easy | Tree DFS |
| 14 | Merge K Sorted Lists | Hard | Heap |
| 15 | Task Scheduler | Medium | Greedy/Heap |
| 16 | Accounts Merge | Medium | Union-Find |
| 17 | Continuous Subarray Sum | Medium | Prefix Sum |
| 18 | Pow(x, n) | Medium | Math |
| 19 | Range Sum Query 2D | Medium | Prefix Sum |
| 20 | Alien Dictionary | Hard | Topological Sort |
| 21 | Buildings With an Ocean View | Medium | Monotonic Stack |
| 22 | Nested List Weight Sum | Medium | DFS |
| 23 | Dot Product of Two Sparse Vectors | Medium | Design |
| 24 | Basic Calculator II | Medium | Stack |
| 25 | Valid Word Abbreviation | Easy | Two Pointers |
| 26 | Simplify Path | Medium | Stack |
| 27 | Kth Largest Element | Medium | Heap |
| 28 | Find Peak Element | Medium | Binary Search |
| 29 | Letter Combinations of Phone Number | Medium | Backtracking |
| 30 | LRU Cache | Medium | Design |

## Microsoft Top 30

| # | Problem | Difficulty | Pattern |
|---|---------|------------|---------|
| 1 | Two Sum | Easy | HashMap |
| 2 | Reverse Linked List | Easy | Linked List |
| 3 | Valid Parentheses | Easy | Stack |
| 4 | Merge Two Sorted Lists | Easy | Linked List |
| 5 | Add Two Numbers | Medium | Linked List |
| 6 | Binary Tree Level Order | Medium | BFS |
| 7 | Validate BST | Medium | Tree DFS |
| 8 | Lowest Common Ancestor | Medium | Tree |
| 9 | Serialize and Deserialize Binary Tree | Hard | Tree |
| 10 | LRU Cache | Medium | Design |
| 11 | Number of Islands | Medium | Graph DFS |
| 12 | Merge Intervals | Medium | Intervals |
| 13 | 3Sum | Medium | Two Pointers |
| 14 | Longest Substring Without Repeating | Medium | Sliding Window |
| 15 | Search in Rotated Sorted Array | Medium | Binary Search |
| 16 | Set Matrix Zeroes | Medium | Matrix |
| 17 | Spiral Matrix | Medium | Matrix |
| 18 | Rotate Image | Medium | Matrix |
| 19 | Group Anagrams | Medium | HashMap |
| 20 | Word Break | Medium | DP |
| 21 | Coin Change | Medium | DP |
| 22 | Min Stack | Medium | Design |
| 23 | Flatten Binary Tree to Linked List | Medium | Tree |
| 24 | Copy List with Random Pointer | Medium | Linked List |
| 25 | Course Schedule | Medium | Topological Sort |
| 26 | Reverse Linked List II | Medium | Linked List |
| 27 | Permutations | Medium | Backtracking |
| 28 | String to Integer (atoi) | Medium | String |
| 29 | Median of Two Sorted Arrays | Hard | Binary Search |
| 30 | Trapping Rain Water | Hard | Two Pointers |
