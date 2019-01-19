package com.developer.prihann.time_bus.helper;

public enum DefaultFormat {
    format01 {
        @Override
        public String toString() {
            return "yyyy-MM-dd";//2009-12-31
        }
    },
    format02 {
        @Override
        public String toString() {
            return "dd-MM-YYYY";//31-12-2009
        }
    },
    format03 {
        @Override
        public String toString() {
            return "yyyy-MM-dd HH:mm:ss";//2009-12-31 23:59:59
        }
    },
    format04 {
        @Override
        public String toString() {
            return "HH:mm:ss.SSS";//23:59.59.999
        }
    },
    format05 {
        @Override
        public String toString() {
            return "yyyy-MM-dd HH:mm:ss.SSS";//2009-12-31 23:59:59.999
        }
    },
    format06 {
        @Override
        public String toString() {
            return "yyyy-MM-dd HH:mm:ss.SSS Z";//2009-12-31 23:59:59.999 +0100
        }
    },
    format07 {
        @Override
        public String toString() {
            return "MM/dd/yyyy";//01/02/2018
        }
    },
    format08 {
        @Override
        public String toString() {
            return "dd-M-yyyy hh:mm:ss";//02-1-2018 06:07:59
        }
    },
    format09 {
        @Override
        public String toString() {
            return "dd MMMM yyyy";//02 January 2018
        }
    },
    format10 {
        @Override
        public String toString() {
            return "dd MMMM yyyy zzzz";//02 January 2018 India Standard Time
        }
    },
    format11 {
        @Override
        public String toString() {
            return "E, dd MMM yyyy HH:mm:ss z";//Tue, 02 Jan 2018 18:07:59 IST
        }
    },
    format12 {
        @Override
        public String toString() {
            return "h:mm a";//3:00 PM
        }
    },
    format13 {
        @Override
        public String toString() {
            return "a";//AM or PM
        }
    };

    public static String getDefaultFormat(DefaultFormat defaultFormat) {
        switch (defaultFormat) {
            case format01:
                return "yyyy-MM-dd";
            case format02:
                return "dd-MM-YYYY";
            case format03:
                return "yyyy-MM-dd HH:mm:ss";
            case format04:
                return "HH:mm:ss.SSS";
            case format05:
                return "yyyy-MM-dd HH:mm:ss.SSS";
            case format06:
                return "yyyy-MM-dd HH:mm:ss.SSS Z";
            case format07:
                return "MM/dd/yyyy";
            case format08:
                return "dd-M-yyyy hh:mm:ss";
            case format09:
                return "dd MMMM yyyy";
            case format10:
                return "dd MMMM yyyy zzzz";
            case format11:
                return "E, dd MMM yyyy HH:mm:ss z";
            case format12:
                return "h:mm a";
            case format13:
                return "a";

        }
        return "dd.MM.yyyy";
    }
}
