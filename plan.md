# 8-Week DSA Interview Preparation Plan

## Overview

**Target:** Cover all major DSA patterns systematically  
**Daily Commitment:** 2-3 hours on weekdays, 4-5 hours on weekends  
**Total Problems:** ~120-140 problems  
**Platform:** LeetCode (primary), supplemented by NeetCode explanations

---

## Weekly Structure

| Day | Focus | Time |
|-----|-------|------|
| Monday - Friday | New pattern learning + problem solving | 2-3 hrs/day |
| Saturday | Deep practice + harder problems | 4-5 hrs |
| Sunday | Review week's problems + revisit failures | 3-4 hrs |

---

## Progress Tracking Legend

- ⬜ Not started
- 🟡 Attempted but need revision
- ✅ Solved independently
- 🔁 Revisit needed

---

# WEEK 1: Arrays, Strings & Two Pointers

## Goals
- Master array/string manipulation
- Understand Two Pointers pattern thoroughly
- Build problem-solving stamina

---

### Day 1 (Monday): Array Basics & Warm-up

**Theory (30 mins):**
- Review Java array operations, ArrayList vs Array
- Time complexity of common operations

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | 15 min | ⬜ |
| 2 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Easy | 20 min | ⬜ |
| 3 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | 15 min | ⬜ |
| 4 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | 25 min | ⬜ |

**Key Concepts:**
- HashMap for O(1) lookups
- Tracking min/max while iterating
- Prefix/suffix products

---

### Day 2 (Tuesday): Two Pointers - Opposite Direction

**Theory (30 mins):**
- Two pointers pattern: when pointers move toward each other
- Sorted array advantages

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | 15 min | ⬜ |
| 2 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | Medium | 20 min | ⬜ |
| 3 | [3Sum](https://leetcode.com/problems/3sum/) | Medium | 35 min | ⬜ |
| 4 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | 25 min | ⬜ |

**Template - Two Pointers (Opposite Direction):**
```java
public void twoPointers(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        // Process arr[left] and arr[right]
        if (condition) {
            left++;
        } else {
            right--;
        }
    }
}
```

---

### Day 3 (Wednesday): Two Pointers - Same Direction

**Theory (20 mins):**
- Fast and slow pointers
- In-place array modifications

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy | 15 min | ⬜ |
| 2 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy | 15 min | ⬜ |
| 3 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy | 15 min | ⬜ |
| 4 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Medium | 25 min | ⬜ |

**Template - Two Pointers (Same Direction):**
```java
public int removeInPlace(int[] arr, int val) {
    int slow = 0;
    for (int fast = 0; fast < arr.length; fast++) {
        if (arr[fast] != val) {
            arr[slow++] = arr[fast];
        }
    }
    return slow;
}
```

---

### Day 4 (Thursday): String Problems

**Theory (20 mins):**
- String immutability in Java
- StringBuilder for modifications
- Character frequency counting

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | 15 min | ⬜ |
| 2 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) | Easy | 20 min | ⬜ |
| 3 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | Easy | 15 min | ⬜ |
| 4 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | 25 min | ⬜ |

---

### Day 5 (Friday): Advanced Two Pointers

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [4Sum](https://leetcode.com/problems/4sum/) | Medium | 35 min | ⬜ |
| 2 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | 40 min | ⬜ |
| 3 | [Rotate Array](https://leetcode.com/problems/rotate-array/) | Medium | 25 min | ⬜ |

---

### Day 6 (Saturday): Deep Practice

**Morning (2.5 hrs) - New Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | Medium | 30 min | ⬜ |
| 2 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | 30 min | ⬜ |
| 3 | [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/) | Medium | 30 min | ⬜ |

**Afternoon (2 hrs) - Revisit:**
- Re-solve any problem you couldn't complete
- Write notes on patterns you've observed

---

### Day 7 (Sunday): Week 1 Review

**Tasks:**
1. Revisit all 🟡 marked problems (solve without looking at solution)
2. Create a cheat sheet for Two Pointers pattern
3. Time yourself on 2-3 random problems from the week

**Self-Assessment Questions:**
- [ ] Can I identify when to use two pointers?
- [ ] Do I understand the difference between opposite vs same direction?
- [ ] Can I solve 3Sum without hints?

---

# WEEK 2: Sliding Window & Binary Search

## Goals
- Master fixed and variable size sliding windows
- Understand binary search variations
- Know when to apply each pattern

---

### Day 8 (Monday): Sliding Window - Fixed Size

**Theory (30 mins):**
- Fixed window: size known upfront
- Maintain window sum/state efficiently

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | Easy | 15 min | ⬜ |
| 2 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Medium | 30 min | ⬜ |
| 3 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Medium | 30 min | ⬜ |

**Template - Fixed Sliding Window:**
```java
public int fixedWindow(int[] arr, int k) {
    int windowSum = 0;
    // Build first window
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }
    int maxSum = windowSum;
    // Slide the window
    for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k];  // Add new, remove old
        maxSum = Math.max(maxSum, windowSum);
    }
    return maxSum;
}
```

---

### Day 9 (Tuesday): Sliding Window - Variable Size

**Theory (30 mins):**
- Expand window until condition breaks
- Contract from left to restore condition

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | 25 min | ⬜ |
| 2 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium | 30 min | ⬜ |
| 3 | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) | Medium | 25 min | ⬜ |

**Template - Variable Sliding Window:**
```java
public int variableWindow(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int left = 0, maxLen = 0;
    
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        map.put(c, map.getOrDefault(c, 0) + 1);
        
        // Contract window while condition is violated
        while (windowInvalid(map)) {
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) - 1);
            if (map.get(leftChar) == 0) map.remove(leftChar);
            left++;
        }
        
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
}
```

---

### Day 10 (Wednesday): Advanced Sliding Window

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard | 45 min | ⬜ |
| 2 | [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | Hard | 45 min | ⬜ |
| 3 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard | 40 min | ⬜ |

---

### Day 11 (Thursday): Binary Search Basics

**Theory (30 mins):**
- Standard binary search template
- Finding boundaries (first/last occurrence)
- Common pitfalls (infinite loops, off-by-one)

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Binary Search](https://leetcode.com/problems/binary-search/) | Easy | 10 min | ⬜ |
| 2 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | Easy | 15 min | ⬜ |
| 3 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Medium | 25 min | ⬜ |
| 4 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) | Easy | 20 min | ⬜ |

**Template - Binary Search:**
```java
// Standard - find exact match
public int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}

// Find leftmost (first occurrence)
public int findFirst(int[] arr, int target) {
    int left = 0, right = arr.length - 1, result = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            result = mid;
            right = mid - 1;  // Keep searching left
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return result;
}
```

---

### Day 12 (Friday): Binary Search Variations

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | 30 min | ⬜ |
| 2 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | 25 min | ⬜ |
| 3 | [Find Peak Element](https://leetcode.com/problems/find-peak-element/) | Medium | 20 min | ⬜ |
| 4 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) | Medium | 20 min | ⬜ |

---

### Day 13 (Saturday): Binary Search on Answer

**Theory (30 mins):**
- When the answer itself is the search space
- Monotonic property in the answer space

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | Medium | 30 min | ⬜ |
| 2 | [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) | Medium | 30 min | ⬜ |
| 3 | [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) | Hard | 40 min | ⬜ |
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard | 45 min | ⬜ |

**Template - Binary Search on Answer:**
```java
public int minCapacity(int[] weights, int days) {
    int left = max(weights);  // Minimum possible answer
    int right = sum(weights); // Maximum possible answer
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (canShip(weights, days, mid)) {
            right = mid;  // Try smaller capacity
        } else {
            left = mid + 1;  // Need larger capacity
        }
    }
    return left;
}

private boolean canShip(int[] weights, int days, int capacity) {
    int currentLoad = 0, daysNeeded = 1;
    for (int w : weights) {
        if (currentLoad + w > capacity) {
            daysNeeded++;
            currentLoad = 0;
        }
        currentLoad += w;
    }
    return daysNeeded <= days;
}
```

---

### Day 14 (Sunday): Week 2 Review

**Tasks:**
1. Revisit all 🟡 marked problems
2. Create cheat sheets for Sliding Window and Binary Search
3. Mixed practice: pick 2 random problems from each pattern

**Self-Assessment:**
- [ ] Can I identify fixed vs variable window problems?
- [ ] Do I know when to use binary search on answer?
- [ ] Can I handle rotated array problems?

---

# WEEK 3: Linked Lists & Stacks

## Goals
- Master linked list manipulation
- Understand fast/slow pointer technique
- Learn stack-based patterns

---

### Day 15 (Monday): Linked List Basics

**Theory (30 mins):**
- ListNode structure in Java
- Pointer manipulation
- Dummy node technique

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | 15 min | ⬜ |
| 2 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | 20 min | ⬜ |
| 3 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | 20 min | ⬜ |
| 4 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | Easy | 10 min | ⬜ |

**Template - Reverse Linked List:**
```java
public ListNode reverseList(ListNode head) {
    ListNode prev = null, curr = head;
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
```

---

### Day 16 (Tuesday): Fast & Slow Pointers

**Theory (20 mins):**
- Floyd's cycle detection
- Finding middle, cycle start

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy | 15 min | ⬜ |
| 2 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | Medium | 25 min | ⬜ |
| 3 | [Happy Number](https://leetcode.com/problems/happy-number/) | Easy | 20 min | ⬜ |
| 4 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | Medium | 30 min | ⬜ |

**Template - Cycle Detection:**
```java
public boolean hasCycle(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
    }
    return false;
}

public ListNode detectCycleStart(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
}
```

---

### Day 17 (Wednesday): Advanced Linked List

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | Easy | 25 min | ⬜ |
| 2 | [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | Medium | 30 min | ⬜ |
| 3 | [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/) | Medium | 25 min | ⬜ |
| 4 | [Reorder List](https://leetcode.com/problems/reorder-list/) | Medium | 30 min | ⬜ |

---

### Day 18 (Thursday): Stack Fundamentals

**Theory (30 mins):**
- Stack operations and use cases
- Monotonic stack concept
- Expression parsing

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Easy | 15 min | ⬜ |
| 2 | [Min Stack](https://leetcode.com/problems/min-stack/) | Medium | 20 min | ⬜ |
| 3 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) | Medium | 20 min | ⬜ |
| 4 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | Medium | 25 min | ⬜ |

**Template - Monotonic Stack (Next Greater Element):**
```java
public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    Arrays.fill(result, -1);
    Deque<Integer> stack = new ArrayDeque<>();  // Store indices
    
    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
            result[stack.pop()] = nums[i];
        }
        stack.push(i);
    }
    return result;
}
```

---

### Day 19 (Friday): Monotonic Stack

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | Easy | 20 min | ⬜ |
| 2 | [Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/) | Medium | 25 min | ⬜ |
| 3 | [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) | Hard | 40 min | ⬜ |
| 4 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) (stack approach) | Hard | 35 min | ⬜ |

---

### Day 20 (Saturday): Complex Linked List & Stack

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/) | Hard | 45 min | ⬜ |
| 2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Medium | 25 min | ⬜ |
| 3 | [LRU Cache](https://leetcode.com/problems/lru-cache/) | Medium | 40 min | ⬜ |
| 4 | [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/) | Medium | 35 min | ⬜ |

---

### Day 21 (Sunday): Week 3 Review

**Tasks:**
1. Revisit all 🟡 problems
2. Implement LRU Cache from scratch without looking
3. Practice drawing linked list operations on paper

**Self-Assessment:**
- [ ] Can I reverse a linked list iteratively and recursively?
- [ ] Do I understand Floyd's cycle detection proof?
- [ ] Can I identify monotonic stack problems?

---

# WEEK 4: Trees (BFS, DFS, BST)

## Goals
- Master tree traversals (iterative and recursive)
- Understand BST properties
- Learn common tree patterns

---

### Day 22 (Monday): Tree Traversals

**Theory (30 mins):**
- Preorder, Inorder, Postorder (recursive + iterative)
- Level order (BFS)
- TreeNode structure

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Easy | 15 min | ⬜ |
| 2 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | Easy | 15 min | ⬜ |
| 3 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium | 20 min | ⬜ |
| 4 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | Easy | 15 min | ⬜ |

**Template - Iterative Inorder:**
```java
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode curr = root;
    
    while (curr != null || !stack.isEmpty()) {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        curr = stack.pop();
        result.add(curr.val);
        curr = curr.right;
    }
    return result;
}
```

---

### Day 23 (Tuesday): Tree DFS Patterns

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | 10 min | ⬜ |
| 2 | [Same Tree](https://leetcode.com/problems/same-tree/) | Easy | 10 min | ⬜ |
| 3 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | 10 min | ⬜ |
| 4 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | Easy | 15 min | ⬜ |
| 5 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Easy | 20 min | ⬜ |

---

### Day 24 (Wednesday): Path Problems

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Path Sum](https://leetcode.com/problems/path-sum/) | Easy | 15 min | ⬜ |
| 2 | [Path Sum II](https://leetcode.com/problems/path-sum-ii/) | Medium | 25 min | ⬜ |
| 3 | [Path Sum III](https://leetcode.com/problems/path-sum-iii/) | Medium | 30 min | ⬜ |
| 4 | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | Hard | 35 min | ⬜ |

---

### Day 25 (Thursday): BST Operations

**Theory (20 mins):**
- BST property: left < root < right
- Inorder traversal gives sorted order

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | 20 min | ⬜ |
| 2 | [Lowest Common Ancestor of a BST](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | Medium | 20 min | ⬜ |
| 3 | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Medium | 20 min | ⬜ |
| 4 | [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | Easy | 20 min | ⬜ |

---

### Day 26 (Friday): Tree BFS & Level Problems

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) | Medium | 25 min | ⬜ |
| 2 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | Medium | 20 min | ⬜ |
| 3 | [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/) | Easy | 15 min | ⬜ |
| 4 | [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | Easy | 15 min | ⬜ |

**Template - Level Order BFS:**
```java
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    
    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Integer> currentLevel = new ArrayList<>();
        
        for (int i = 0; i < levelSize; i++) {
            TreeNode node = queue.poll();
            currentLevel.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        result.add(currentLevel);
    }
    return result;
}
```

---

### Day 27 (Saturday): Advanced Tree Problems

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | Medium | 25 min | ⬜ |
| 2 | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | 35 min | ⬜ |
| 3 | [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | Hard | 40 min | ⬜ |
| 4 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | Easy | 20 min | ⬜ |

---

### Day 28 (Sunday): Week 4 Review

**Tasks:**
1. Revisit all 🟡 problems
2. Practice iterative traversals without reference
3. Solve 3 random tree problems timed

**Self-Assessment:**
- [ ] Can I do all traversals iteratively?
- [ ] Do I understand when to use BFS vs DFS for trees?
- [ ] Can I construct trees from traversals?

---

# WEEK 5: Graphs (BFS, DFS, Topological Sort)

## Goals
- Master graph representations
- Learn BFS/DFS on graphs
- Understand topological sort and Union-Find

---

### Day 29 (Monday): Graph Basics & DFS

**Theory (40 mins):**
- Adjacency list vs matrix
- DFS on graphs (vs trees)
- Visited tracking

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Medium | 25 min | ⬜ |
| 2 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) | Medium | 25 min | ⬜ |
| 3 | [Clone Graph](https://leetcode.com/problems/clone-graph/) | Medium | 30 min | ⬜ |

**Template - Graph DFS:**
```java
public void dfs(int[][] grid, int i, int j, boolean[][] visited) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length 
        || visited[i][j] || grid[i][j] == 0) {
        return;
    }
    visited[i][j] = true;
    int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    for (int[] dir : dirs) {
        dfs(grid, i + dir[0], j + dir[1], visited);
    }
}
```

---

### Day 30 (Tuesday): Graph BFS

**Theory (20 mins):**
- BFS for shortest path in unweighted graphs
- State-space search

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) | Medium | 30 min | ⬜ |
| 2 | [01 Matrix](https://leetcode.com/problems/01-matrix/) | Medium | 30 min | ⬜ |
| 3 | [Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/) | Medium | 30 min | ⬜ |

**Template - Multi-source BFS:**
```java
public int orangesRotting(int[][] grid) {
    Queue<int[]> queue = new LinkedList<>();
    int fresh = 0;
    
    // Add all rotten oranges to queue
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == 2) queue.offer(new int[]{i, j});
            else if (grid[i][j] == 1) fresh++;
        }
    }
    
    int minutes = 0;
    int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    
    while (!queue.isEmpty() && fresh > 0) {
        minutes++;
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int ni = curr[0] + dir[0], nj = curr[1] + dir[1];
                if (ni >= 0 && ni < grid.length && nj >= 0 && 
                    nj < grid[0].length && grid[ni][nj] == 1) {
                    grid[ni][nj] = 2;
                    fresh--;
                    queue.offer(new int[]{ni, nj});
                }
            }
        }
    }
    return fresh == 0 ? minutes : -1;
}
```

---

### Day 31 (Wednesday): Topological Sort

**Theory (30 mins):**
- DAG and topological ordering
- Kahn's algorithm (BFS)
- DFS-based approach

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Course Schedule](https://leetcode.com/problems/course-schedule/) | Medium | 30 min | ⬜ |
| 2 | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) | Medium | 30 min | ⬜ |
| 3 | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary/) (Premium) or similar | Hard | 40 min | ⬜ |

**Template - Kahn's Algorithm:**
```java
public int[] topologicalSort(int numCourses, int[][] prerequisites) {
    List<List<Integer>> graph = new ArrayList<>();
    int[] indegree = new int[numCourses];
    
    for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
    
    for (int[] pre : prerequisites) {
        graph.get(pre[1]).add(pre[0]);
        indegree[pre[0]]++;
    }
    
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
        if (indegree[i] == 0) queue.offer(i);
    }
    
    int[] result = new int[numCourses];
    int idx = 0;
    
    while (!queue.isEmpty()) {
        int curr = queue.poll();
        result[idx++] = curr;
        for (int next : graph.get(curr)) {
            if (--indegree[next] == 0) queue.offer(next);
        }
    }
    return idx == numCourses ? result : new int[0];
}
```

---

### Day 32 (Thursday): Union-Find

**Theory (30 mins):**
- Disjoint Set data structure
- Path compression and union by rank
- Applications

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Number of Connected Components in an Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) | Medium | 25 min | ⬜ |
| 2 | [Redundant Connection](https://leetcode.com/problems/redundant-connection/) | Medium | 30 min | ⬜ |
| 3 | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/) | Medium | 30 min | ⬜ |

**Template - Union-Find:**
```java
class UnionFind {
    int[] parent, rank;
    int components;
    
    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        components = n;
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);  // Path compression
        }
        return parent[x];
    }
    
    public boolean union(int x, int y) {
        int px = find(x), py = find(y);
        if (px == py) return false;
        
        // Union by rank
        if (rank[px] < rank[py]) { parent[px] = py; }
        else if (rank[px] > rank[py]) { parent[py] = px; }
        else { parent[py] = px; rank[px]++; }
        
        components--;
        return true;
    }
}
```

---

### Day 33 (Friday): Advanced Graph Problems

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/) | Medium | 35 min | ⬜ |
| 2 | [Surrounded Regions](https://leetcode.com/problems/surrounded-regions/) | Medium | 30 min | ⬜ |
| 3 | [Word Ladder](https://leetcode.com/problems/word-ladder/) | Hard | 40 min | ⬜ |

---

### Day 34 (Saturday): Shortest Path Algorithms

**Theory (30 mins):**
- Dijkstra's algorithm
- When to use BFS vs Dijkstra

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Network Delay Time](https://leetcode.com/problems/network-delay-time/) | Medium | 35 min | ⬜ |
| 2 | [Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) | Medium | 40 min | ⬜ |
| 3 | [Path with Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/) | Medium | 35 min | ⬜ |

**Template - Dijkstra:**
```java
public int networkDelayTime(int[][] times, int n, int k) {
    Map<Integer, List<int[]>> graph = new HashMap<>();
    for (int[] t : times) {
        graph.computeIfAbsent(t[0], x -> new ArrayList<>()).add(new int[]{t[1], t[2]});
    }
    
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    pq.offer(new int[]{k, 0});
    Map<Integer, Integer> dist = new HashMap<>();
    
    while (!pq.isEmpty()) {
        int[] curr = pq.poll();
        int node = curr[0], time = curr[1];
        
        if (dist.containsKey(node)) continue;
        dist.put(node, time);
        
        if (graph.containsKey(node)) {
            for (int[] next : graph.get(node)) {
                if (!dist.containsKey(next[0])) {
                    pq.offer(new int[]{next[0], time + next[1]});
                }
            }
        }
    }
    
    if (dist.size() != n) return -1;
    return Collections.max(dist.values());
}
```

---

### Day 35 (Sunday): Week 5 Review

**Tasks:**
1. Revisit all 🟡 problems
2. Implement Union-Find from scratch
3. Practice identifying BFS vs DFS vs Topological Sort

**Self-Assessment:**
- [ ] Can I detect cycles in directed/undirected graphs?
- [ ] Do I understand when to use Union-Find vs DFS?
- [ ] Can I implement Dijkstra from memory?

---

# WEEK 6: Backtracking & Recursion

## Goals
- Master backtracking template
- Handle permutations, combinations, subsets
- Solve constraint satisfaction problems

---

### Day 36 (Monday): Subsets & Combinations

**Theory (30 mins):**
- Backtracking template
- Include/exclude pattern
- State management

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Subsets](https://leetcode.com/problems/subsets/) | Medium | 20 min | ⬜ |
| 2 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | Medium | 25 min | ⬜ |
| 3 | [Combinations](https://leetcode.com/problems/combinations/) | Medium | 20 min | ⬜ |
| 4 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | 25 min | ⬜ |

**Template - Backtracking:**
```java
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(nums, 0, new ArrayList<>(), result);
    return result;
}

private void backtrack(int[] nums, int start, List<Integer> current, 
                       List<List<Integer>> result) {
    result.add(new ArrayList<>(current));  // Add current state
    
    for (int i = start; i < nums.length; i++) {
        current.add(nums[i]);              // Make choice
        backtrack(nums, i + 1, current, result);  // Explore
        current.remove(current.size() - 1); // Undo choice (backtrack)
    }
}
```

---

### Day 37 (Tuesday): Permutations

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Permutations](https://leetcode.com/problems/permutations/) | Medium | 25 min | ⬜ |
| 2 | [Permutations II](https://leetcode.com/problems/permutations-ii/) | Medium | 30 min | ⬜ |
| 3 | [Next Permutation](https://leetcode.com/problems/next-permutation/) | Medium | 30 min | ⬜ |
| 4 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Medium | 25 min | ⬜ |

---

### Day 38 (Wednesday): Combination Sum Variants

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | Medium | 25 min | ⬜ |
| 2 | [Combination Sum III](https://leetcode.com/problems/combination-sum-iii/) | Medium | 25 min | ⬜ |
| 3 | [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/) | Medium | 25 min | ⬜ |
| 4 | [Target Sum](https://leetcode.com/problems/target-sum/) | Medium | 30 min | ⬜ |

---

### Day 39 (Thursday): String Backtracking

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | Medium | 30 min | ⬜ |
| 2 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | Medium | 25 min | ⬜ |
| 3 | [Word Search](https://leetcode.com/problems/word-search/) | Medium | 30 min | ⬜ |
| 4 | [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/) | Medium | 30 min | ⬜ |

---

### Day 40 (Friday): Grid Backtracking

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [N-Queens](https://leetcode.com/problems/n-queens/) | Hard | 40 min | ⬜ |
| 2 | [N-Queens II](https://leetcode.com/problems/n-queens-ii/) | Hard | 30 min | ⬜ |
| 3 | [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/) | Hard | 45 min | ⬜ |

---

### Day 41 (Saturday): Mixed Backtracking

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Word Search II](https://leetcode.com/problems/word-search-ii/) | Hard | 50 min | ⬜ |
| 2 | [Expression Add Operators](https://leetcode.com/problems/expression-add-operators/) | Hard | 50 min | ⬜ |
| 3 | [Partition to K Equal Sum Subsets](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/) | Medium | 40 min | ⬜ |

---

### Day 42 (Sunday): Week 6 Review

**Tasks:**
1. Revisit all 🟡 problems
2. Create a decision tree: when to use which backtracking variant
3. Time yourself on 3 medium backtracking problems

**Self-Assessment:**
- [ ] Can I distinguish permutation vs combination problems?
- [ ] Do I know how to handle duplicates?
- [ ] Can I write the backtracking template from memory?

---

# WEEK 7: Dynamic Programming

## Goals
- Master DP thinking process
- Learn major DP patterns
- Convert recursion → memoization → tabulation

---

### Day 43 (Monday): 1D DP Basics

**Theory (45 mins):**
- DP fundamentals: overlapping subproblems, optimal substructure
- Top-down (memoization) vs bottom-up (tabulation)
- State definition and transitions

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Easy | 15 min | ⬜ |
| 2 | [House Robber](https://leetcode.com/problems/house-robber/) | Medium | 25 min | ⬜ |
| 3 | [House Robber II](https://leetcode.com/problems/house-robber-ii/) | Medium | 25 min | ⬜ |
| 4 | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | Easy | 20 min | ⬜ |

**Template - 1D DP:**
```java
// Top-down with memoization
public int solve(int n, int[] memo) {
    if (n <= 1) return n;
    if (memo[n] != 0) return memo[n];
    memo[n] = solve(n-1, memo) + solve(n-2, memo);
    return memo[n];
}

// Bottom-up tabulation
public int climbStairs(int n) {
    if (n <= 2) return n;
    int[] dp = new int[n + 1];
    dp[1] = 1; dp[2] = 2;
    for (int i = 3; i <= n; i++) {
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}

// Space optimized
public int climbStairsOptimized(int n) {
    if (n <= 2) return n;
    int prev2 = 1, prev1 = 2;
    for (int i = 3; i <= n; i++) {
        int curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }
    return prev1;
}
```

---

### Day 44 (Tuesday): Coin/Jump Problems

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Coin Change](https://leetcode.com/problems/coin-change/) | Medium | 30 min | ⬜ |
| 2 | [Coin Change II](https://leetcode.com/problems/coin-change-ii/) | Medium | 30 min | ⬜ |
| 3 | [Jump Game](https://leetcode.com/problems/jump-game/) | Medium | 25 min | ⬜ |
| 4 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/) | Medium | 30 min | ⬜ |

---

### Day 45 (Wednesday): 2D DP / Grid Problems

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Unique Paths](https://leetcode.com/problems/unique-paths/) | Medium | 20 min | ⬜ |
| 2 | [Unique Paths II](https://leetcode.com/problems/unique-paths-ii/) | Medium | 25 min | ⬜ |
| 3 | [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/) | Medium | 25 min | ⬜ |
| 4 | [Triangle](https://leetcode.com/problems/triangle/) | Medium | 25 min | ⬜ |

**Template - 2D Grid DP:**
```java
public int minPathSum(int[][] grid) {
    int m = grid.length, n = grid[0].length;
    int[][] dp = new int[m][n];
    
    dp[0][0] = grid[0][0];
    
    // First row
    for (int j = 1; j < n; j++) dp[0][j] = dp[0][j-1] + grid[0][j];
    
    // First column
    for (int i = 1; i < m; i++) dp[i][0] = dp[i-1][0] + grid[i][0];
    
    // Fill rest
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
            dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
        }
    }
    return dp[m-1][n-1];
}
```

---

### Day 46 (Thursday): String DP

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | Medium | 30 min | ⬜ |
| 2 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | Medium | 25 min | ⬜ |
| 3 | [Word Break](https://leetcode.com/problems/word-break/) | Medium | 30 min | ⬜ |
| 4 | [Decode Ways](https://leetcode.com/problems/decode-ways/) | Medium | 30 min | ⬜ |

---

### Day 47 (Friday): LCS/LIS Patterns

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) | Medium | 30 min | ⬜ |
| 2 | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) | Medium | 30 min | ⬜ |
| 3 | [Edit Distance](https://leetcode.com/problems/edit-distance/) | Medium | 35 min | ⬜ |
| 4 | [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/) | Hard | 40 min | ⬜ |

**Template - LCS:**
```java
public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length(), n = text2.length();
    int[][] dp = new int[m + 1][n + 1];
    
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (text1.charAt(i-1) == text2.charAt(j-1)) {
                dp[i][j] = dp[i-1][j-1] + 1;
            } else {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    return dp[m][n];
}
```

---

### Day 48 (Saturday): Knapsack & Partition

**Theory (30 mins):**
- 0/1 Knapsack pattern
- Unbounded Knapsack
- Subset sum variations

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) | Medium | 30 min | ⬜ |
| 2 | [Target Sum](https://leetcode.com/problems/target-sum/) | Medium | 30 min | ⬜ |
| 3 | [Last Stone Weight II](https://leetcode.com/problems/last-stone-weight-ii/) | Medium | 35 min | ⬜ |
| 4 | [Ones and Zeroes](https://leetcode.com/problems/ones-and-zeroes/) | Medium | 40 min | ⬜ |

**Template - 0/1 Knapsack:**
```java
public boolean canPartition(int[] nums) {
    int sum = Arrays.stream(nums).sum();
    if (sum % 2 != 0) return false;
    int target = sum / 2;
    
    boolean[] dp = new boolean[target + 1];
    dp[0] = true;
    
    for (int num : nums) {
        for (int j = target; j >= num; j--) {  // Reverse order for 0/1
            dp[j] = dp[j] || dp[j - num];
        }
    }
    return dp[target];
}
```

---

### Day 49 (Sunday): Week 7 Review

**Tasks:**
1. Revisit all 🟡 problems
2. Practice identifying DP patterns
3. Convert 3 memoization solutions to tabulation

**Self-Assessment:**
- [ ] Can I identify the state for a DP problem?
- [ ] Do I understand 0/1 vs unbounded knapsack?
- [ ] Can I optimize space in 2D DP?

---

# WEEK 8: Heaps, Tries, Bit Manipulation & Mock Interviews

## Goals
- Complete remaining patterns
- Practice under interview conditions
- Build speed and confidence

---

### Day 50 (Monday): Heaps / Priority Queue

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | Medium | 25 min | ⬜ |
| 2 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Medium | 30 min | ⬜ |
| 3 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) | Hard | 35 min | ⬜ |
| 4 | [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | 35 min | ⬜ |

**Template - Two Heaps for Median:**
```java
class MedianFinder {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) return maxHeap.peek();
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
```

---

### Day 51 (Tuesday): Trie

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) | Medium | 30 min | ⬜ |
| 2 | [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) | Medium | 35 min | ⬜ |
| 3 | [Word Search II](https://leetcode.com/problems/word-search-ii/) | Hard | 45 min | ⬜ |

**Template - Trie:**
```java
class Trie {
    private TrieNode root = new TrieNode();
    
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isEnd = true;
    }
    
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }
    
    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) return null;
            node = node.children[idx];
        }
        return node;
    }
}
```

---

### Day 52 (Wednesday): Bit Manipulation

**Theory (30 mins):**
- Basic operations: AND, OR, XOR, NOT, shifts
- Common tricks: check/set/clear bit, count bits

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Single Number](https://leetcode.com/problems/single-number/) | Easy | 10 min | ⬜ |
| 2 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | Easy | 15 min | ⬜ |
| 3 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | Easy | 20 min | ⬜ |
| 4 | [Missing Number](https://leetcode.com/problems/missing-number/) | Easy | 15 min | ⬜ |
| 5 | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) | Medium | 25 min | ⬜ |
| 6 | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | Easy | 20 min | ⬜ |

---

### Day 53 (Thursday): Intervals & Greedy

**Problems:**

| # | Problem | Difficulty | Time | Status |
|---|---------|------------|------|--------|
| 1 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | 25 min | ⬜ |
| 2 | [Insert Interval](https://leetcode.com/problems/insert-interval/) | Medium | 30 min | ⬜ |
| 3 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) | Medium | 25 min | ⬜ |
| 4 | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) | Medium | 30 min | ⬜ |
| 5 | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | Medium | 35 min | ⬜ |

---

### Day 54 (Friday): Mock Interview #1

**Format:** Simulate real interview conditions

**Session 1 (45 mins):**
- Pick 1 Medium + 1 Hard from any pattern
- Timer on, no hints
- Explain approach out loud

**Session 2 (45 mins):**
- Pick 2 Medium problems from different patterns
- Focus on optimal solutions
- Practice time/space complexity analysis

**Debrief:**
- What went well?
- Where did you struggle?
- What patterns need more work?

---

### Day 55 (Saturday): Mock Interview #2 + Weak Areas

**Morning - Mock (1.5 hrs):**
- 3 problems (Easy, Medium, Hard)
- Strict 20/30/40 min time limits

**Afternoon - Focus on Weak Areas (2-3 hrs):**
- Revisit patterns you struggled with
- Solve 3-4 problems from those patterns

---

### Day 56 (Sunday): Final Review

**Tasks:**

1. **Pattern Quick Reference Review:**
    - Go through all templates once
    - Ensure you can recall the approach for each pattern

2. **Speed Round:**
    - Solve 5-6 Easy problems in 60 minutes
    - Focus on clean, working code

3. **Self-Assessment Checklist:**

| Pattern | Confident? | Need Review? |
|---------|------------|--------------|
| Two Pointers | ⬜ | ⬜ |
| Sliding Window | ⬜ | ⬜ |
| Binary Search | ⬜ | ⬜ |
| Fast/Slow Pointers | ⬜ | ⬜ |
| Linked List Reversal | ⬜ | ⬜ |
| Stacks (Monotonic) | ⬜ | ⬜ |
| Tree Traversals | ⬜ | ⬜ |
| Graph BFS/DFS | ⬜ | ⬜ |
| Topological Sort | ⬜ | ⬜ |
| Union-Find | ⬜ | ⬜ |
| Backtracking | ⬜ | ⬜ |
| DP (1D, 2D, String) | ⬜ | ⬜ |
| Heaps | ⬜ | ⬜ |
| Trie | ⬜ | ⬜ |
| Bit Manipulation | ⬜ | ⬜ |

---

# Post-Plan: Maintenance Mode

After completing the 8 weeks:

**Daily (30 mins):**
- Solve 1-2 random problems
- Use LeetCode's "Random" feature

**Weekly:**
- 1 mock interview session
- Revisit 1 weak pattern

**Before Interviews:**
- Review all templates
- Do 2-3 mock interviews
- Rest well!

---

# Quick Reference: Pattern Recognition

| If you see... | Think... |
|---------------|----------|
| Sorted array, find pair | Two Pointers |
| Subarray/substring, contiguous | Sliding Window |
| Sorted + search/find boundary | Binary Search |
| Linked list, cycle, middle | Fast/Slow Pointers |
| Tree, hierarchy | DFS/BFS |
| Shortest path (unweighted) | BFS |
| All possibilities, combinations | Backtracking |
| Optimal, min/max, count ways | DP |
| Top K, streaming | Heap |
| Prefix matching, autocomplete | Trie |
| Dependencies, ordering | Topological Sort |
| Connected components | Union-Find / DFS |
| Range overlaps | Intervals |
| XOR trick, bit operations | Bit Manipulation |

---

# Resources

**Problem Lists:**
- [NeetCode 150](https://neetcode.io/practice)
- [Blind 75](https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions)
- [Grind 75](https://www.techinterviewhandbook.org/grind75)

**Video Explanations:**
- NeetCode YouTube
- Abdul Bari (Algorithms)
- Back to Back SWE

**Books:**
- "Cracking the Coding Interview" - Gayle McDowell
- "Elements of Programming Interviews in Java"

---

**Good luck with your preparation! 🚀**