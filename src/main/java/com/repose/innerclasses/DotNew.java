package com.repose.innerclasses;

/**
 * @author 11629
 */
public class DotNew {

    public class Inner {

    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }

}