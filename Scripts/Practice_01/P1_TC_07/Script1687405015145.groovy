//7. Cho test data: [Java, C#, C++, PyThon, Golang, Swift, Scartch] -> viết code: Nhập vào giá trị và trả về là vị trí(index) của giá trị vừa nhập trong test data. 
//Nếu không tìm thấy thì thông báo "Không tìm thấy".
//* Không phân biệt hoa thường

List arr = ["Java", "C#", "C++", "PyThon", "Golang", "Swift", "Scartch"] 
String input = "scartch"
boolean flag
for(int i = 0; i < arr.size(); i++) {
	if(input.equalsIgnoreCase(arr[i])) {
		println(i+1)
		flag = true
	}
	}
if(flag == false) {
	println('khong tim thay')
}