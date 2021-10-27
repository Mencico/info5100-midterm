package Question1;

public class NonFiction extends Book implements iBorrowable{

    int BorrowDate;
    int ReturnDate;

    public NonFiction(String title, double price, String publishYear){
        super(title, price, publishYear);
    }

    public int getBorrowDate() {
        return BorrowDate;
    }

    public int getReturnDate() {
        return ReturnDate;
    }

    @Override
    public String description() {
        return getTitle() + " all events are true and based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {
        this.BorrowDate = day;

    }

    @Override
    public void setReturnDate(int day) {
        this.ReturnDate = day;

    }

    @Override
    public boolean isAvailable(int day) {
        if(BorrowDate <= day && day <= ReturnDate){
            return false;
        } else return true;
    }
}
