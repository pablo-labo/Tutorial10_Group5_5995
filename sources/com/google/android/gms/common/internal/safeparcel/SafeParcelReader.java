package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.m6;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    public static BigDecimal a(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iS);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static Bundle b(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iS);
        return bundle;
    }

    public static byte[] c(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iS);
        return bArrCreateByteArray;
    }

    public static int[] d(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iS);
        return iArrCreateIntArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iS);
        return tCreateFromParcel;
    }

    public static String f(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iS);
        return string;
    }

    public static String[] g(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iS);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iS);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return tArr;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iS);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    public static boolean l(Parcel parcel, int i) {
        v(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Double m(Parcel parcel, int i) {
        int iS = s(parcel, i);
        if (iS == 0) {
            return null;
        }
        w(parcel, iS, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static IBinder n(Parcel parcel, int i) {
        int iS = s(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iS == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iS);
        return strongBinder;
    }

    public static int o(Parcel parcel, int i) {
        v(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer p(Parcel parcel, int i) {
        int iS = s(parcel, i);
        if (iS == 0) {
            return null;
        }
        w(parcel, iS, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long q(Parcel parcel, int i) {
        v(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int i) {
        int iS = s(parcel, i);
        if (iS == 0) {
            return null;
        }
        w(parcel, iS, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int s(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void t(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, i));
    }

    public static int u(Parcel parcel) {
        int i = parcel.readInt();
        int iS = s(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iS + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new ParseException(sb.toString(), parcel);
    }

    public static void v(Parcel parcel, int i, int i2) {
        int iS = s(parcel, i);
        if (iS == i2) {
            return;
        }
        String hexString = Integer.toHexString(iS);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iS).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iS);
        throw new ParseException(m6.h(sb, " (0x", hexString, ")"), parcel);
    }

    public static void w(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new ParseException(m6.h(sb, " (0x", hexString, ")"), parcel);
    }
}
