//1. Cho 1 test data như sau :  [1, 2, 3, 4, 5, 6, 7, 8, 9] -> viết code xuất tách ra làm 2 mảng : số lẻ và số chẵn


List arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
List chan = []
List le = []
for(int i = 0; i < arr.size(); i++) { 
	if(arr[i]%2 == 0) {
		chan.add(arr[i])
	}
	else {
		le.add(arr[i])
	}
}
println('so chan: ' + chan)
println('so le: ' + le)