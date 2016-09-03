"""
    Discription : https://en.wikipedia.org/wiki/Bubble_sort
    Input :  [11, 3, 4, 9, -2, 6, 3, 9, 11, 7]
    Output : [-2, 3, 3, 4, 6, 7, 9, 9, 11, 11]
    Complexity : Worst, Best, Avg = O(n^2, O(n), o(n^2))
    Author : Paras Patel
"""

inp_arr = [11, 3, 4, 9, -2, 6, 3, 9, 11, 7]
def bubblesort(inp_arr):
	for i in xrange(len(inp_arr)-1,0, -1):
		for j in xrange(0,i):
			if inp_arr[j] > inp_arr[j+1]:
				inp_arr[j], inp_arr[j+1] = inp_arr[j+1], inp_arr[j]
	return inp_arr

print bubblesort(inp_arr)
