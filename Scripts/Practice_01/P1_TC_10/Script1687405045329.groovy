//11. Tạo data hashmap BMI gồm "Tên, Chiều Cao" với giá trị tùy ý -> Viết Code Nhập vào 'cân nặng ' và xuất ra kết quả (KQ)như sau :
//* công thức tính KQ = Cân nặng (kg) / (chiều cao(mét) * chiều Cao(mét))
//- KQ  < 16: "Thể trạng của bạn là : Gầy độ III"
//- 16 <= KQ < 17:  "Thể trạng của bạn là : Gầy độ II"
//- 17 <= KQ < 18.5:  "Thể trạng của bạn là : Gầy độ I"
//- 18.5 <= KQ < 25:  "Thể trạng của bạn là : Bình thường"
//- 25 <= KQ < 30:  "Thể trạng của bạn là : Thừa cân"
//- 30 <= KQ < 35: "Thể trạng của bạn là : Béo phì độ I"
//- 35 <= KQ < 40: "Thể trạng của bạn là : Béo phì độ II"
//- KQ > 40 : "Thể trạng của bạn là : Béo phì độ III"
//-> Gán KQ vào lại test Data BMI

def BMI = ["Ten":"Nguyen Van A", "Chieu cao":"1.6"]
int can_nang = 65
String t = BMI.get("Chieu cao")
float t1 = Float.valueOf(t)
float KQ = can_nang/(t1*t1)
if(KQ < 16) {
	println('The trang cua ban la: ' + KQ + '. Gay do III')
}
else {
	if(KQ >= 16 && KQ < 17) {
		println('The trang cua ban la: ' + KQ + '. Gay do II')
	}
	else {
		if(KQ >= 17 && KQ < 18.5) {
			println('The trang cua ban la: ' + KQ + '. Gay do I')
		}
		else {
			if(KQ >= 18.5 && KQ < 25) {
				println('The trang cua ban la: ' + KQ + '. Binh thuong')
			}
			else {
				if(KQ >= 25 && KQ < 30) {
					println('The trang cua ban la: ' + KQ + '. Thua can')
				}
				else {
					if(KQ >= 30 && KQ < 35) {
						println('The trang cua ban la: ' + KQ + '. Beo phi do I')
					}
					else {
						if(KQ >= 35 && KQ < 40) {
							println('The trang cua ban la: ' + KQ + '. Beo phi do II')
						}
						else {
							println('The trang cua ban la: ' + KQ + '. Beo phi do III')
						}
					}
				}
			}
		}
	}
}
def map = ["BMI":KQ]
BMI.putAll(map)
println(BMI)
