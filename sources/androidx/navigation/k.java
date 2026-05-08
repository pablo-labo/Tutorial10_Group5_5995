package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.a;
import androidx.navigation.u;
import defpackage.aba;
import defpackage.akb;
import defpackage.d2f;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.l5;
import defpackage.laa;
import defpackage.loe;
import defpackage.mj8;
import defpackage.t40;
import defpackage.uac;
import defpackage.w20;
import defpackage.yid;
import defpackage.zve;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public static final /* synthetic */ int Z = 0;
    public final LinkedHashMap V;
    public int W;
    public String X;
    public d2f Y;
    public final String a;
    public l b;
    public String c;
    public CharSequence d;
    public final ArrayList e;
    public final loe<laa> f;

    public static final class a {
        public static String a(Context context, int i) {
            String strValueOf;
            context.getClass();
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
            strValueOf.getClass();
            return strValueOf;
        }
    }

    public static final class b implements Comparable<b> {
        public final k a;
        public final Bundle b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final int f;

        public b(k kVar, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            this.a = kVar;
            this.b = bundle;
            this.c = z;
            this.d = i;
            this.e = z2;
            this.f = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            bVar.getClass();
            boolean z = bVar.e;
            boolean z2 = bVar.c;
            Bundle bundle = bVar.b;
            boolean z3 = this.c;
            if (z3 && !z2) {
                return 1;
            }
            if (!z3 && z2) {
                return -1;
            }
            int i = this.d - bVar.d;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle2 = this.b;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                bundle.getClass();
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z4 = this.e;
            if (z4 && !z) {
                return 1;
            }
            if (z4 || !z) {
                return this.f - bVar.f;
            }
            return -1;
        }
    }

    public static final class c extends mj8 implements Function1<String, Boolean> {
        final /* synthetic */ aba $navDeepLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(aba abaVar) {
            super(1);
            this.$navDeepLink = abaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            str.getClass();
            return Boolean.valueOf(!this.$navDeepLink.c().contains(r1));
        }
    }

    public static final class d extends mj8 implements gu5<aba> {
        final /* synthetic */ String $tempRoute;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.$tempRoute = str;
        }

        @Override // defpackage.gu5
        public final aba invoke() {
            String str = this.$tempRoute;
            str.getClass();
            return new aba(str, null, null);
        }
    }

    public static final class e extends mj8 implements Function1<String, Boolean> {
        final /* synthetic */ aba $tempDeepLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(aba abaVar) {
            super(1);
            this.$tempDeepLink = abaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            str.getClass();
            return Boolean.valueOf(!this.$tempDeepLink.c().contains(r1));
        }
    }

    static {
        new LinkedHashMap();
    }

    public k(s<? extends k> sVar) {
        sVar.getClass();
        LinkedHashMap linkedHashMap = u.b;
        this.a = u.a.a(sVar.getClass());
        this.e = new ArrayList();
        this.f = new loe<>(0);
        this.V = new LinkedHashMap();
    }

    public final void a(aba abaVar) {
        abaVar.getClass();
        ArrayList arrayListH = yid.h(this.V, new c(abaVar));
        if (arrayListH.isEmpty()) {
            this.e.add(abaVar);
        } else {
            t40.o("Deep link ", abaVar.a, " can't be used to open destination ", this, ".\nFollowing required arguments are missing: ", arrayListH);
        }
    }

    public final Bundle b(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.V;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            androidx.navigation.b bVar = (androidx.navigation.b) entry.getValue();
            bVar.getClass();
            str.getClass();
            if (bVar.c && (obj = bVar.e) != null) {
                bVar.a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                androidx.navigation.b bVar2 = (androidx.navigation.b) entry2.getValue();
                boolean z = bVar2.d;
                r<Object> rVar = bVar2.a;
                if (!z) {
                    str2.getClass();
                    if (bVar2.b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                        try {
                            rVar.a(str2, bundle2);
                        } catch (ClassCastException unused) {
                        }
                    }
                    w20.q(akb.m("Wrong argument type for '", str2, "' in argument bundle. "), rVar.b(), " expected.");
                    return null;
                }
            }
        }
        return bundle2;
    }

    public final laa d(int i) {
        loe<laa> loeVar = this.f;
        laa laaVarE = loeVar.h() == 0 ? null : loeVar.e(i);
        if (laaVarE != null) {
            return laaVarE;
        }
        l lVar = this.b;
        if (lVar != null) {
            return lVar.d(i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1
            if (r9 != r10) goto L5
            goto Lb7
        L5:
            r1 = 0
            if (r10 == 0) goto Lb8
            boolean r2 = r10 instanceof androidx.navigation.k
            if (r2 != 0) goto Le
            goto Lb8
        Le:
            androidx.navigation.k r10 = (androidx.navigation.k) r10
            loe<laa> r2 = r10.f
            java.util.LinkedHashMap r3 = r10.V
            java.util.ArrayList r4 = r10.e
            java.util.ArrayList r5 = r9.e
            boolean r4 = defpackage.wl7.b(r5, r4)
            loe<laa> r5 = r9.f
            int r6 = r5.h()
            int r7 = r2.h()
            if (r6 != r7) goto L58
            moe r6 = new moe
            r6.<init>(r5)
            r6e r6 = defpackage.v6e.L(r6)
            vp2 r6 = (defpackage.vp2) r6
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L56
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r5.e(r7)
            java.lang.Object r7 = r2.e(r7)
            boolean r7 = defpackage.wl7.b(r8, r7)
            if (r7 != 0) goto L37
            goto L58
        L56:
            r2 = r0
            goto L59
        L58:
            r2 = r1
        L59:
            java.util.LinkedHashMap r5 = r9.V
            int r6 = r5.size()
            int r7 = r3.size()
            if (r6 != r7) goto La0
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            y92 r5 = defpackage.z92.G0(r5)
            java.lang.Iterable r5 = r5.a
            java.util.Iterator r5 = r5.iterator()
        L75:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9e
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r7 = r3.containsKey(r7)
            if (r7 == 0) goto La0
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r7 = r3.get(r7)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = defpackage.wl7.b(r7, r6)
            if (r6 == 0) goto La0
            goto L75
        L9e:
            r3 = r0
            goto La1
        La0:
            r3 = r1
        La1:
            int r5 = r9.W
            int r6 = r10.W
            if (r5 != r6) goto Lb8
            java.lang.String r9 = r9.X
            java.lang.String r10 = r10.X
            boolean r9 = defpackage.wl7.b(r9, r10)
            if (r9 == 0) goto Lb8
            if (r4 == 0) goto Lb8
            if (r2 == 0) goto Lb8
            if (r3 == 0) goto Lb8
        Lb7:
            return r0
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.k.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.navigation.k.b f(defpackage.cba r21) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.k.f(cba):androidx.navigation.k$b");
    }

    public final b g(String str) {
        aba abaVar;
        str.getClass();
        d2f d2fVar = this.Y;
        if (d2fVar == null || (abaVar = (aba) d2fVar.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        uri.getClass();
        Bundle bundleD = abaVar.d(uri, this.V);
        if (bundleD == null) {
            return null;
        }
        return new b(this, bundleD, abaVar.p, abaVar.b(uri), false, -1);
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.W * 31;
        String str = this.X;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (aba abaVar : this.e) {
            int i2 = iHashCode * 31;
            String str2 = abaVar.a;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = abaVar.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = abaVar.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        loe<laa> loeVar = this.f;
        loeVar.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < loeVar.h())) {
                break;
            }
            int i4 = i3 + 1;
            laa laaVarI = loeVar.i(i3);
            int i5 = ((iHashCode * 31) + laaVarI.a) * 31;
            p pVar = laaVarI.b;
            iHashCode = i5 + (pVar != null ? pVar.hashCode() : 0);
            Bundle bundle = laaVarI.c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i6 = iHashCode * 31;
                    Bundle bundle2 = laaVarI.c;
                    bundle2.getClass();
                    Object obj = bundle2.get(str5);
                    iHashCode = i6 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i3 = i4;
        }
        LinkedHashMap linkedHashMap = this.V;
        for (String str6 : linkedHashMap.keySet()) {
            int iD = akb.d(iHashCode * 31, 31, str6);
            Object obj2 = linkedHashMap.get(str6);
            iHashCode = iD + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public void i(Context context, AttributeSet attributeSet) {
        context.getClass();
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, uac.e);
        typedArrayObtainAttributes.getClass();
        k(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.W = resourceId;
            this.c = null;
            this.c = a.a(context, resourceId);
        }
        this.d = typedArrayObtainAttributes.getText(0);
        j6g j6gVar = j6g.a;
        typedArrayObtainAttributes.recycle();
    }

    public final void j(int i, laa laaVar) {
        laaVar.getClass();
        if (!(this instanceof a.C0068a)) {
            if (i != 0) {
                this.f.g(i, laaVar);
                return;
            } else {
                l5.q("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void k(String str) {
        if (str == null) {
            this.W = 0;
            this.c = null;
        } else {
            if (zve.U(str)) {
                l5.q("Cannot have an empty route");
                return;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str);
            ArrayList arrayListH = yid.h(this.V, new e(new aba(strConcat, null, null)));
            if (!arrayListH.isEmpty()) {
                t40.o("Cannot set route \"", str, "\" for destination ", this, ". Following required arguments are missing: ", arrayListH);
                return;
            } else {
                this.Y = new d2f(new d(strConcat));
                this.W = strConcat.hashCode();
                this.c = null;
            }
        }
        this.X = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.W));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.X;
        if (str2 != null && !zve.U(str2)) {
            sb.append(" route=");
            sb.append(this.X);
        }
        if (this.d != null) {
            sb.append(" label=");
            sb.append(this.d);
        }
        return sb.toString();
    }
}
