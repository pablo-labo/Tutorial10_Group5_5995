package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Base64;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import defpackage.b0;
import defpackage.dc8;
import defpackage.fib;
import defpackage.l5;
import defpackage.ojd;
import defpackage.r6;
import defpackage.xna;
import defpackage.yid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FastJsonResponse {

    public interface a<I, O> {
    }

    public static final Object f(Field field, Object obj) {
        a aVar = field.Z;
        if (aVar != null) {
            StringToIntConverter stringToIntConverter = (StringToIntConverter) aVar;
            obj = (String) stringToIntConverter.c.get(((Integer) obj).intValue());
            if (obj == null && stringToIntConverter.b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    public static final void g(StringBuilder sb, Field field, Object obj) {
        int i = field.b;
        if (i == 11) {
            Class cls = field.W;
            fib.i(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(dc8.a((String) obj));
            sb.append("\"");
        }
    }

    public abstract Map<String, Field<?, ?>> a();

    public Object b(Field field) {
        String str = field.f;
        if (field.W == null) {
            return c();
        }
        boolean z = c() == null;
        String str2 = field.f;
        if (!z) {
            r6.g(l5.l("Concrete field shouldn't be value object: ", str2));
            return null;
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e) {
            l5.r(e);
            return null;
        }
    }

    public abstract Object c();

    public boolean d(Field field) {
        if (field.d != 11) {
            return e();
        }
        if (field.e) {
            b0.u("Concrete type arrays not supported");
            return false;
        }
        b0.u("Concrete types not supported");
        return false;
    }

    public abstract boolean e();

    public String toString() {
        Map<String, Field<?, ?>> mapA = a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : mapA.keySet()) {
            Field<?, ?> field = mapA.get(str);
            if (d(field)) {
                Object objF = f(field, b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objF != null) {
                    switch (field.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objF, 0));
                            sb.append("\"");
                            break;
                        case DatadogLogGenerator.CRASH /* 9 */:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) objF, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            yid.j(sb, (HashMap) objF);
                            break;
                        default:
                            if (field.c) {
                                ArrayList arrayList = (ArrayList) objF;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                g(sb, field, objF);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.a CREATOR = new com.google.android.gms.common.server.response.a();
        public final int V;
        public final Class W;
        public final String X;
        public zan Y;
        public final a Z;
        public final int a;
        public final int b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final String f;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaaVar) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = i3;
            this.e = z2;
            this.f = str;
            this.V = i4;
            if (str2 == null) {
                this.W = null;
                this.X = null;
            } else {
                this.W = SafeParcelResponse.class;
                this.X = str2;
            }
            if (zaaVar == null) {
                this.Z = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.b;
            if (stringToIntConverter != null) {
                this.Z = stringToIntConverter;
            } else {
                r6.g("There was no converter wrapped in this ConverterWrapper.");
                throw null;
            }
        }

        public static Field s0(int i, String str) {
            return new Field(7, true, 7, true, str, i, null);
        }

        public final String toString() {
            xna.a aVar = new xna.a(this);
            aVar.a(Integer.valueOf(this.a), "versionCode");
            aVar.a(Integer.valueOf(this.b), "typeIn");
            aVar.a(Boolean.valueOf(this.c), "typeInArray");
            aVar.a(Integer.valueOf(this.d), "typeOut");
            aVar.a(Boolean.valueOf(this.e), "typeOutArray");
            aVar.a(this.f, "outputFieldName");
            aVar.a(Integer.valueOf(this.V), "safeParcelFieldId");
            String str = this.X;
            if (str == null) {
                str = null;
            }
            aVar.a(str, "concreteTypeName");
            Class cls = this.W;
            if (cls != null) {
                aVar.a(cls.getCanonicalName(), "concreteType.class");
            }
            a aVar2 = this.Z;
            if (aVar2 != null) {
                aVar.a(aVar2.getClass().getCanonicalName(), "converterName");
            }
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = ojd.A(parcel, 20293);
            ojd.y(parcel, 1, 4);
            parcel.writeInt(this.a);
            ojd.y(parcel, 2, 4);
            parcel.writeInt(this.b);
            ojd.y(parcel, 3, 4);
            parcel.writeInt(this.c ? 1 : 0);
            ojd.y(parcel, 4, 4);
            parcel.writeInt(this.d);
            ojd.y(parcel, 5, 4);
            parcel.writeInt(this.e ? 1 : 0);
            ojd.t(parcel, 6, this.f, false);
            ojd.y(parcel, 7, 4);
            parcel.writeInt(this.V);
            zaa zaaVar = null;
            String str = this.X;
            if (str == null) {
                str = null;
            }
            ojd.t(parcel, 8, str, false);
            a aVar = this.Z;
            if (aVar != null) {
                if (!(aVar instanceof StringToIntConverter)) {
                    l5.q("Unsupported safe parcelable field converter class.");
                    return;
                }
                zaaVar = new zaa((StringToIntConverter) aVar);
            }
            ojd.s(parcel, 9, zaaVar, i, false);
            ojd.B(parcel, iA);
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
            this.a = 1;
            this.b = i;
            this.c = z;
            this.d = i2;
            this.e = z2;
            this.f = str;
            this.V = i3;
            this.W = cls;
            if (cls == null) {
                this.X = null;
            } else {
                this.X = cls.getCanonicalName();
            }
            this.Z = null;
        }
    }
}
