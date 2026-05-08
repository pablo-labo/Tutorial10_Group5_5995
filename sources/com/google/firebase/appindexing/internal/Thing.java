package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ojd;
import defpackage.xna;
import defpackage.zqa;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Thing extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Thing> CREATOR = new a();
    public final int a;
    public final Bundle b;
    public final zza c;
    public final String d;
    public final String e;

    public static class zza extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zza> CREATOR = new b();
        public final boolean a;
        public final int b;
        public final String c;
        public final Bundle d;

        public zza(boolean z, int i, String str, Bundle bundle) {
            this.a = z;
            this.b = i;
            this.c = str;
            this.d = bundle == null ? new Bundle() : bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return xna.a(Boolean.valueOf(this.a), Boolean.valueOf(zzaVar.a)) && xna.a(Integer.valueOf(this.b), Integer.valueOf(zzaVar.b)) && xna.a(this.c, zzaVar.c) && Thing.R0(this.d, zzaVar.d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(Thing.n1(this.d))});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("worksOffline: ");
            sb.append(this.a);
            sb.append(", score: ");
            sb.append(this.b);
            String str = this.c;
            if (!str.isEmpty()) {
                sb.append(", accountEmail: ");
                sb.append(str);
            }
            Bundle bundle = this.d;
            if (bundle != null && !bundle.isEmpty()) {
                sb.append(", Properties { ");
                Thing.s0(bundle, sb);
                sb.append("}");
            }
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA = ojd.A(parcel, 20293);
            ojd.y(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            ojd.y(parcel, 2, 4);
            parcel.writeInt(this.b);
            ojd.t(parcel, 3, this.c, false);
            ojd.l(parcel, 4, this.d);
            ojd.B(parcel, iA);
        }
    }

    public Thing(int i, Bundle bundle, zza zzaVar, String str, String str2) {
        this.a = i;
        this.b = bundle;
        this.c = zzaVar;
        this.d = str;
        this.e = str2;
        bundle.setClassLoader(Thing.class.getClassLoader());
    }

    public static boolean R0(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !R0((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null && (obj2 != null || !bundle2.containsKey(str))) {
                return false;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    public static int n1(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Object obj2 = bundle.get((String) obj);
            if (obj2 instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj2)));
            } else if (obj2 instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj2)));
            } else if (obj2 instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj2)));
            } else if (obj2 instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj2)));
            } else if (obj2 instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj2)));
            } else {
                arrayList2.add(Integer.valueOf(Arrays.hashCode(new Object[]{obj2})));
            }
        }
        return Arrays.hashCode(arrayList2.toArray());
    }

    public static void s0(Bundle bundle, StringBuilder sb) {
        try {
            Set<String> setKeySet = bundle.keySet();
            String[] strArr = (String[]) setKeySet.toArray(new String[setKeySet.size()]);
            Arrays.sort(strArr, zqa.c);
            for (String str : strArr) {
                sb.append("{ key: '");
                sb.append(str);
                sb.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb.append("<null>");
                } else if (obj.getClass().isArray()) {
                    sb.append("[ ");
                    for (int i = 0; i < Array.getLength(obj); i++) {
                        sb.append("'");
                        sb.append(Array.get(obj, i));
                        sb.append("' ");
                    }
                    sb.append("]");
                } else {
                    sb.append(obj.toString());
                }
                sb.append(" } ");
            }
        } catch (RuntimeException unused) {
            sb.append("<error>");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) obj;
        return xna.a(Integer.valueOf(this.a), Integer.valueOf(thing.a)) && xna.a(this.d, thing.d) && xna.a(this.e, thing.e) && xna.a(this.c, thing.c) && R0(this.b, thing.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.d, this.e, Integer.valueOf(this.c.hashCode()), Integer.valueOf(n1(this.b))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.e;
        if (str.equals("Thing")) {
            str = "Indexable";
        }
        sb.append(str);
        sb.append(" { { id: ");
        String str2 = this.d;
        if (str2 == null) {
            sb.append("<null>");
        } else {
            sb.append("'");
            sb.append(str2);
            sb.append("'");
        }
        sb.append(" } Properties { ");
        s0(this.b, sb);
        sb.append("} ");
        sb.append("Metadata { ");
        sb.append(this.c.toString());
        sb.append(" } ");
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = ojd.A(parcel, 20293);
        ojd.l(parcel, 1, this.b);
        ojd.s(parcel, 2, this.c, i, false);
        ojd.t(parcel, 3, this.d, false);
        ojd.t(parcel, 4, this.e, false);
        ojd.y(parcel, 1000, 4);
        parcel.writeInt(this.a);
        ojd.B(parcel, iA);
    }
}
