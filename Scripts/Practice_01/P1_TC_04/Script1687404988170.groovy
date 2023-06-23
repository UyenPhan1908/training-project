import org.apache.commons.lang.RandomStringUtils

//4. Viết code khi nhập vào số N sẽ trả về  danh sách gồm N phần tử kiểu String
//* Giá trị phần tử là tùy ý và duy nhất
//* ví dụ: N = 4 => [ a, b, c, d]…

int N = 4
List text = []
for(int i = 0; i < N; i++) {
	String t = RandomStringUtils.randomAlphabetic(3)
	text.add(t)
	}
println(text)
