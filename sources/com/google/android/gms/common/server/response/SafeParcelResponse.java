package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.b0;
import defpackage.dc8;
import defpackage.fib;
import defpackage.l5;
import defpackage.lch;
import defpackage.ojd;
import defpackage.p6;
import defpackage.r6;
import defpackage.yid;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new lch();
    public int V;
    public final int a;
    public final Parcel b;
    public final int c;
    public final zan d;
    public final String e;
    public int f;

    public SafeParcelResponse(int i, Parcel parcel, zan zanVar) {
        this.a = i;
        fib.i(parcel);
        this.b = parcel;
        this.c = 2;
        this.d = zanVar;
        this.e = zanVar == null ? null : zanVar.c;
        this.f = 2;
    }

    public static void i(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger bigInteger;
        Parcel parcelObtain;
        BigInteger[] bigIntegerArr;
        long[] jArrCreateLongArray;
        float[] fArrCreateFloatArray;
        double[] dArrCreateDoubleArray;
        BigDecimal[] bigDecimalArr;
        boolean[] zArrCreateBooleanArray;
        Parcel[] parcelArr;
        BigInteger bigInteger2;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).V, entry);
        }
        sb.append('{');
        int iU = SafeParcelReader.u(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) i);
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                FastJsonResponse.a aVar = field.Z;
                String str2 = field.X;
                int i2 = field.d;
                if (aVar != null) {
                    switch (i2) {
                        case 0:
                            k(sb, field, FastJsonResponse.f(field, Integer.valueOf(SafeParcelReader.o(parcel, i))));
                            break;
                        case 1:
                            int iS = SafeParcelReader.s(parcel, i);
                            int iDataPosition = parcel.dataPosition();
                            if (iS == 0) {
                                bigInteger2 = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iS);
                                bigInteger2 = new BigInteger(bArrCreateByteArray);
                            }
                            k(sb, field, FastJsonResponse.f(field, bigInteger2));
                            break;
                        case 2:
                            k(sb, field, FastJsonResponse.f(field, Long.valueOf(SafeParcelReader.q(parcel, i))));
                            break;
                        case 3:
                            SafeParcelReader.v(parcel, i, 4);
                            k(sb, field, FastJsonResponse.f(field, Float.valueOf(parcel.readFloat())));
                            break;
                        case 4:
                            SafeParcelReader.v(parcel, i, 8);
                            k(sb, field, FastJsonResponse.f(field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.a(parcel, i)));
                            break;
                        case 6:
                            k(sb, field, FastJsonResponse.f(field, Boolean.valueOf(SafeParcelReader.l(parcel, i))));
                            break;
                        case 7:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.f(parcel, i)));
                            break;
                        case 8:
                        case DatadogLogGenerator.CRASH /* 9 */:
                            k(sb, field, FastJsonResponse.f(field, SafeParcelReader.c(parcel, i)));
                            break;
                        case 10:
                            Bundle bundleB = SafeParcelReader.b(parcel, i);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleB.keySet()) {
                                String string = bundleB.getString(str3);
                                fib.i(string);
                                map2.put(str3, string);
                            }
                            k(sb, field, FastJsonResponse.f(field, map2));
                            break;
                        case 11:
                            l5.q("Method does not accept concrete type.");
                            return;
                        default:
                            l5.q(p6.c(i2, "Unknown field out type = "));
                            return;
                    }
                } else if (field.e) {
                    sb.append("[");
                    switch (i2) {
                        case 0:
                            int[] iArrD = SafeParcelReader.d(parcel, i);
                            int length = iArrD.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                if (i3 != 0) {
                                    sb.append(",");
                                }
                                sb.append(iArrD[i3]);
                            }
                            break;
                        case 1:
                            int iS2 = SafeParcelReader.s(parcel, i);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iS2 == 0) {
                                bigIntegerArr = null;
                            } else {
                                int i4 = parcel.readInt();
                                bigIntegerArr = new BigInteger[i4];
                                for (int i5 = 0; i5 < i4; i5++) {
                                    bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(iDataPosition2 + iS2);
                            }
                            int length2 = bigIntegerArr.length;
                            for (int i6 = 0; i6 < length2; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigIntegerArr[i6]);
                            }
                            break;
                        case 2:
                            int iS3 = SafeParcelReader.s(parcel, i);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iS3 == 0) {
                                jArrCreateLongArray = null;
                            } else {
                                jArrCreateLongArray = parcel.createLongArray();
                                parcel.setDataPosition(iDataPosition3 + iS3);
                            }
                            int length3 = jArrCreateLongArray.length;
                            for (int i7 = 0; i7 < length3; i7++) {
                                if (i7 != 0) {
                                    sb.append(",");
                                }
                                sb.append(jArrCreateLongArray[i7]);
                            }
                            break;
                        case 3:
                            int iS4 = SafeParcelReader.s(parcel, i);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iS4 == 0) {
                                fArrCreateFloatArray = null;
                            } else {
                                fArrCreateFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(iDataPosition4 + iS4);
                            }
                            int length4 = fArrCreateFloatArray.length;
                            for (int i8 = 0; i8 < length4; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(fArrCreateFloatArray[i8]);
                            }
                            break;
                        case 4:
                            int iS5 = SafeParcelReader.s(parcel, i);
                            int iDataPosition5 = parcel.dataPosition();
                            if (iS5 == 0) {
                                dArrCreateDoubleArray = null;
                            } else {
                                dArrCreateDoubleArray = parcel.createDoubleArray();
                                parcel.setDataPosition(iDataPosition5 + iS5);
                            }
                            int length5 = dArrCreateDoubleArray.length;
                            for (int i9 = 0; i9 < length5; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append(dArrCreateDoubleArray[i9]);
                            }
                            break;
                        case 5:
                            int iS6 = SafeParcelReader.s(parcel, i);
                            int iDataPosition6 = parcel.dataPosition();
                            if (iS6 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int i10 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[i10];
                                for (int i11 = 0; i11 < i10; i11++) {
                                    bigDecimalArr[i11] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(iDataPosition6 + iS6);
                            }
                            int length6 = bigDecimalArr.length;
                            for (int i12 = 0; i12 < length6; i12++) {
                                if (i12 != 0) {
                                    sb.append(",");
                                }
                                sb.append(bigDecimalArr[i12]);
                            }
                            break;
                        case 6:
                            int iS7 = SafeParcelReader.s(parcel, i);
                            int iDataPosition7 = parcel.dataPosition();
                            if (iS7 == 0) {
                                zArrCreateBooleanArray = null;
                            } else {
                                zArrCreateBooleanArray = parcel.createBooleanArray();
                                parcel.setDataPosition(iDataPosition7 + iS7);
                            }
                            int length7 = zArrCreateBooleanArray.length;
                            for (int i13 = 0; i13 < length7; i13++) {
                                if (i13 != 0) {
                                    sb.append(",");
                                }
                                sb.append(zArrCreateBooleanArray[i13]);
                            }
                            break;
                        case 7:
                            String[] strArrG = SafeParcelReader.g(parcel, i);
                            int length8 = strArrG.length;
                            for (int i14 = 0; i14 < length8; i14++) {
                                if (i14 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(strArrG[i14]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case DatadogLogGenerator.CRASH /* 9 */:
                        case 10:
                            b0.u("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            return;
                        case 11:
                            int iS8 = SafeParcelReader.s(parcel, i);
                            int iDataPosition8 = parcel.dataPosition();
                            if (iS8 == 0) {
                                parcelArr = null;
                            } else {
                                int i15 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[i15];
                                for (int i16 = 0; i16 < i15; i16++) {
                                    int i17 = parcel.readInt();
                                    if (i17 != 0) {
                                        int iDataPosition9 = parcel.dataPosition();
                                        Parcel parcelObtain2 = Parcel.obtain();
                                        parcelObtain2.appendFrom(parcel, iDataPosition9, i17);
                                        parcelArr2[i16] = parcelObtain2;
                                        parcel.setDataPosition(iDataPosition9 + i17);
                                    } else {
                                        parcelArr2[i16] = null;
                                    }
                                }
                                parcel.setDataPosition(iDataPosition8 + iS8);
                                parcelArr = parcelArr2;
                            }
                            int length9 = parcelArr.length;
                            for (int i18 = 0; i18 < length9; i18++) {
                                if (i18 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i18].setDataPosition(0);
                                fib.i(str2);
                                fib.i(field.Y);
                                Map map3 = (Map) field.Y.b.get(str2);
                                fib.i(map3);
                                i(sb, map3, parcelArr[i18]);
                            }
                            break;
                        default:
                            r6.g("Unknown field type out.");
                            return;
                    }
                    sb.append("]");
                } else {
                    switch (i2) {
                        case 0:
                            sb.append(SafeParcelReader.o(parcel, i));
                            break;
                        case 1:
                            int iS9 = SafeParcelReader.s(parcel, i);
                            int iDataPosition10 = parcel.dataPosition();
                            if (iS9 == 0) {
                                bigInteger = null;
                            } else {
                                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition10 + iS9);
                                bigInteger = new BigInteger(bArrCreateByteArray2);
                            }
                            sb.append(bigInteger);
                            break;
                        case 2:
                            sb.append(SafeParcelReader.q(parcel, i));
                            break;
                        case 3:
                            SafeParcelReader.v(parcel, i, 4);
                            sb.append(parcel.readFloat());
                            break;
                        case 4:
                            SafeParcelReader.v(parcel, i, 8);
                            sb.append(parcel.readDouble());
                            break;
                        case 5:
                            sb.append(SafeParcelReader.a(parcel, i));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.l(parcel, i));
                            break;
                        case 7:
                            String strF = SafeParcelReader.f(parcel, i);
                            sb.append("\"");
                            sb.append(dc8.a(strF));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrC = SafeParcelReader.c(parcel, i);
                            sb.append("\"");
                            sb.append(bArrC == null ? null : Base64.encodeToString(bArrC, 0));
                            sb.append("\"");
                            break;
                        case DatadogLogGenerator.CRASH /* 9 */:
                            byte[] bArrC2 = SafeParcelReader.c(parcel, i);
                            sb.append("\"");
                            sb.append(bArrC2 == null ? null : Base64.encodeToString(bArrC2, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle bundleB2 = SafeParcelReader.b(parcel, i);
                            Set<String> setKeySet = bundleB2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str4 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str4);
                                sb.append("\":\"");
                                sb.append(dc8.a(bundleB2.getString(str4)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            int iS10 = SafeParcelReader.s(parcel, i);
                            int iDataPosition11 = parcel.dataPosition();
                            if (iS10 == 0) {
                                parcelObtain = null;
                            } else {
                                parcelObtain = Parcel.obtain();
                                parcelObtain.appendFrom(parcel, iDataPosition11, iS10);
                                parcel.setDataPosition(iDataPosition11 + iS10);
                            }
                            parcelObtain.setDataPosition(0);
                            fib.i(str2);
                            fib.i(field.Y);
                            Map map4 = (Map) field.Y.b.get(str2);
                            fib.i(map4);
                            i(sb, map4, parcelObtain);
                            break;
                        default:
                            r6.g("Unknown field type out");
                            return;
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iU) {
            throw new SafeParcelReader.ParseException(p6.c(iU, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    public static final void j(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                break;
            case 7:
                sb.append("\"");
                fib.i(obj);
                sb.append(dc8.a(obj.toString()));
                sb.append("\"");
                break;
            case 8:
                sb.append("\"");
                byte[] bArr = (byte[]) obj;
                sb.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb.append("\"");
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                sb.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb.append("\"");
                break;
            case 10:
                fib.i(obj);
                yid.j(sb, (HashMap) obj);
                break;
            case 11:
                l5.q("Method does not accept concrete type.");
                break;
            default:
                l5.q(p6.c(i, "Unknown type = "));
                break;
        }
    }

    public static final void k(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        boolean z = field.c;
        int i = field.b;
        if (!z) {
            j(sb, i, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            j(sb, i, arrayList.get(i2));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> a() {
        zan zanVar = this.d;
        if (zanVar == null) {
            return null;
        }
        String str = this.e;
        fib.i(str);
        return (Map) zanVar.b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel h() {
        int i = this.f;
        Parcel parcel = this.b;
        if (i != 0) {
            if (i != 1) {
                return parcel;
            }
            ojd.B(parcel, this.V);
            this.f = 2;
            return parcel;
        }
        int iA = ojd.A(parcel, 20293);
        this.V = iA;
        ojd.B(parcel, iA);
        this.f = 2;
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        zan zanVar = this.d;
        fib.j(zanVar, "Cannot convert to JSON on client side.");
        Parcel parcelH = h();
        parcelH.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.e;
        fib.i(str);
        Map map = (Map) zanVar.b.get(str);
        fib.i(map);
        i(sb, map, parcelH);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.y(parcel, 1, 4);
        parcel.writeInt(this.a);
        Parcel parcelH = h();
        if (parcelH != null) {
            int iA2 = ojd.A(parcel, 2);
            parcel.appendFrom(parcelH, 0, parcelH.dataSize());
            ojd.B(parcel, iA2);
        }
        ojd.s(parcel, 3, this.c != 0 ? this.d : null, i, false);
        ojd.B(parcel, iA);
    }
}
