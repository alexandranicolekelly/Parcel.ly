public class PackageTest {
    public static void main(String[] args){

        Package bozzutto = new Package(145671, "Dell", "Monroe Street Market", "Alexandra",
                                        6, 3, true);
        System.out.printf("Package order number %d from %s for %s was received by %s and has %d item(s)," +
                            " in %d box(es)\n" + "It %s been shipped\n",
                bozzutto.getOrderNumber(),
                bozzutto.getProduct(),
                bozzutto.getOwner(),
                bozzutto.getReceiver(),
                bozzutto.getNumberOfItems(),
                bozzutto.getNumberOfBoxes(),
                (bozzutto.getHasShipped() )?"has":"has not");

        Package mdMgmt= new Package(245672, "Cisco", "Harford Commons", "Jacob",
                1, 7, false);
        System.out.printf("Package order number %d from %s for %s was received by %s and has %d item(s)," +
                        " in %d box(es)\n" + "It %s been shipped\n",
                mdMgmt.getOrderNumber(),
                mdMgmt.getProduct(),
                mdMgmt.getOwner(),
                mdMgmt.getReceiver(),
                mdMgmt.getNumberOfItems(),
                mdMgmt.getNumberOfBoxes(),
                (mdMgmt.getHasShipped() )?"has":"has not");

        Package murn= new Package(356119, "Apple", "The Refinery", "Alexandra",
                2, 2, false);
        System.out.printf("Package order number %d from %s for %s was received by %s and has %d item(s)," +
                        " in %d box(es)\n" + "It %s been shipped\n",
                murn.getOrderNumber(),
                murn.getProduct(),
                murn.getOwner(),
                murn.getReceiver(),
                murn.getNumberOfItems(),
                murn.getNumberOfBoxes(),
                (murn.getHasShipped() )?"has":"has not");
    }

}
