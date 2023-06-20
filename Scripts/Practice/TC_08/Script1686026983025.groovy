//8. Cho test data: [Java, C#, C++, PyThon, Golang, Swift, Scartch] -> viết code: Nhập vào vị trí(Index) và trả về giá trị trong test data. 
//Nếu không tìm thấy thì thông báo "Không tìm thấy".

List arr = ["Java", "C#", "C++", "PyThon", "Golang", "Swift", "Scartch"]
int input = 1
boolean flag
for(int i = 1; i <= arr.size(); i++) {
	if(input == i) {
		println(arr[i-1])
		flag = true
	}
}
if(flag == false) {
	println('khong tim thay')
}