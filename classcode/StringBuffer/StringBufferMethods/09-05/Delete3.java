import javax.sql.rowset.spi.SyncResolver;

class Delete3 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("AmrutaXXXXXXXDalavi");
        sb.delete(6, 13);  //6pasun te 12 prnt delete karat 13 tasach thevt.....
        System.out.println(sb);
    }
}
