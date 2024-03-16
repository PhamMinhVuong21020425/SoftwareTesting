enum BookType {
    SGK,
    STK,
}

public class Library {
    private BookType type;
    private Integer late;

    public Library(BookType type, Integer late) {
        this.type = type;
        this.late = late;
    }

    public BookType getType() {
        return type;
    }

    public Integer getLate() {
        return late;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public String calculateFee() {
        switch (type) {
            case SGK:
                if (late >= 0 && late <= 15) {
                    return Integer.toString(30000 + late * 5000) + "đ";
                } else if (late > 15) {
                    return "230000đ";
                } else {
                    throw new RuntimeException("Invalid Input");
                }
            case STK:
            if (late >= 0 && late <= 15) {
                return Integer.toString(50000 + late * 5000) + "đ";
            } else if (late > 15) {
                return "250000đ";
            } else {
                throw new RuntimeException("Invalid Input");
            }
            default:
                throw new RuntimeException("Invalid Input");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Testing!");
    }
}