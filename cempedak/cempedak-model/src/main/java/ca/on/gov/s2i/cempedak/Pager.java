package ca.on.gov.s2i.cempedak;

public class Pager {
    int size = 10;
    int no = 2;
    int recordCount = 87;
    String title;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public int getRecordCount() {
        return recordCount;
    }
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        return "Pager [size=" + size + ", no=" + no + ", recordCount=" + recordCount + ", title=" + title + "]";
    }
    
}
