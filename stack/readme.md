Operations
1: push - O(1)
2: pop - O(1)
3: peek - O(1)

- we can implement stack using arrays,arraylist,linkedlist. But array size is fixed so we prefer the arraylist and linkedlist.

- for reverse a stack without using extra space we will use the concept of push at bottom instead of push at top.

- for Stock Span Problem formula (max no of consecutive days for which todays price is >= other previous prices ) = current element index - previous high index . for this we store index of prev highs in stack .

- Max area in histogram : area = height * width. And to calculate width always look for each element next smaller in both left and right. where lets assume next left smaller = i and next right smaller = j. so width = j-i-1

