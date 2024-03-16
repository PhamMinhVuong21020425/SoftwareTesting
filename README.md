## Kiểm thử và đảm bảo chất lượng phần mềm

### Mô tả bài toán

Tính tổng chi phí mượn sách (T) mà sinh viên phải trả cho thư viện dựa trên thông tin:

1. **Loại sách:** Sách giáo khoa (SGK) hoặc sách tham khảo (STK)

    - Phí mượn SGK là 30.000đ
    - Phí mượn STK là 50.000đ

2. **Số ngày trễ hạn trả sách (ngày):** int, late >= 0
    - late = 0: Trả sách đúng hạn, không tính thêm phí
    - 0 < late <= 15: Trễ hạn, phạt mỗi ngày 5.000đ
    - late > 15: Coi như không trả, phạt 200.000đ

Nếu đầu vào không thỏa mãn điều kiện sẽ thông báo lỗi.
