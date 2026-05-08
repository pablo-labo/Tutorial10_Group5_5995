package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.k15;
import defpackage.lb3;
import defpackage.pua;
import defpackage.yl6;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tl6 implements cha {
    public final go3 a;
    public final qk6 b;
    public final List<ql6> c;
    public final boolean d;
    public final b e = new b();

    public static final class a {
        public String a;
        public qk6 b;
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
    }

    public final class b implements ql6 {
        public b() {
        }

        @Override // defpackage.ql6
        public final Object a(yl6 yl6Var, do3 do3Var, vl6 vl6Var) {
            return tl6.this.b.e0(yl6Var, vl6Var);
        }
    }

    public static final class c implements ql6 {
        public final List<nl6> a;

        public c(ArrayList arrayList) {
            arrayList.getClass();
            this.a = arrayList;
        }

        @Override // defpackage.ql6
        public final Object a(yl6 yl6Var, do3 do3Var, vl6 vl6Var) {
            sl6 sl6Var = yl6Var.a;
            String str = yl6Var.b;
            sl6Var.getClass();
            str.getClass();
            ArrayList arrayList = new ArrayList();
            ok6 ok6Var = yl6Var.d;
            ok6 ok6Var2 = ok6Var != null ? ok6Var : null;
            List<nl6> list = yl6Var.c;
            list.getClass();
            arrayList.addAll(list);
            k15 k15Var = yl6Var.e;
            k15Var.getClass();
            List<nl6> list2 = this.a;
            list2.getClass();
            arrayList.addAll(list2);
            yl6 yl6Var2 = new yl6(sl6Var, str, arrayList, ok6Var2, k15Var);
            int i = do3Var.b;
            ArrayList arrayList2 = do3Var.a;
            if (i < arrayList2.size()) {
                return ((ql6) arrayList2.get(i)).a(yl6Var2, new do3(i + 1, arrayList2), vl6Var);
            }
            r6.g("Check failed.");
            return null;
        }
    }

    public tl6(go3 go3Var, qk6 qk6Var, List list, boolean z) {
        this.a = go3Var;
        this.b = qk6Var;
        this.c = list;
        this.d = z;
    }

    public static sh0 b(pua puaVar, Throwable th) {
        ApolloException apolloNetworkException = th instanceof ApolloException ? (ApolloException) th : new ApolloNetworkException(th, "Error while reading JSON response");
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        puaVar.getClass();
        return new sh0(uuidRandomUUID, puaVar, null, null, apolloNetworkException, bs4.a, wr4.a, true);
    }

    @Override // defpackage.cha
    public final <D extends pua.a> vi5<sh0<D>> a(rh0<D> rh0Var) throws EOFException {
        lb3 lb3Var;
        boolean z;
        yl6.a aVar;
        rh0Var.getClass();
        k15 k15Var = rh0Var.c;
        lb3.b bVar = lb3.f;
        k15.a aVarC = k15Var.c(bVar);
        aVarC.getClass();
        lb3 lb3Var2 = (lb3) aVarC;
        String str = this.a.a;
        pua<D> puaVar = rh0Var.a;
        lb3 lb3Var3 = (lb3) k15Var.c(bVar);
        if (lb3Var3 == null) {
            lb3Var3 = lb3.g;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nl6("Accept", "multipart/mixed;deferSpec=20220824, application/graphql-response+json, application/json"));
        List<nl6> list = rh0Var.e;
        if (list != null) {
            arrayList.addAll(list);
        }
        Boolean bool = rh0Var.f;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = rh0Var.g;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        boolean z2 = rh0Var.k;
        sl6 sl6Var = rh0Var.d;
        sl6 sl6Var2 = sl6.b;
        if (sl6Var == null) {
            sl6Var = sl6Var2;
        }
        int iOrdinal = sl6Var.ordinal();
        if (iOrdinal != 0) {
            lb3Var = lb3Var2;
            if (iOrdinal != 1) {
                l.g();
                return null;
            }
            String strB = zBooleanValue2 ? puaVar.b() : null;
            Function1 eo3Var = (zBooleanValue || z2) ? new eo3(puaVar.id(), zBooleanValue, z2) : new tr(4);
            lb3Var3.getClass();
            zn1 zn1Var = new zn1();
            so1 so1Var = new so1(zn1Var);
            so1Var.j();
            so1Var.u0("operationName");
            so1Var.T0(puaVar.name());
            so1Var.u0("variables");
            za5 za5Var = new za5(so1Var);
            za5Var.j();
            puaVar.d(za5Var, lb3Var3, false);
            za5Var.t();
            if (strB != null) {
                so1Var.u0("query");
                so1Var.T0(strB);
            }
            eo3Var.invoke(so1Var);
            so1Var.t();
            vr1 vr1VarJ0 = zn1Var.J0(zn1Var.b);
            LinkedHashMap linkedHashMap = za5Var.b;
            ok6 fo3Var = linkedHashMap.isEmpty() ? new fo3(vr1VarJ0) : new khg(linkedHashMap, vr1VarJ0);
            aVar = new yl6.a(sl6Var2, str);
            aVar.c = fo3Var;
            if (wve.K(fo3Var.getContentType(), "multipart/form-data", false)) {
                aVar.d.add(new nl6("Apollo-Require-Preflight", "true"));
            }
        } else {
            lb3Var = lb3Var2;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("operationName", puaVar.name());
            zn1 zn1Var2 = new zn1();
            za5 za5Var2 = new za5(new so1(zn1Var2));
            za5Var2.j();
            puaVar.d(za5Var2, lb3Var3, false);
            za5Var2.t();
            if (!za5Var2.b.isEmpty()) {
                r6.g("FileUpload and Http GET are not supported at the same time");
                return null;
            }
            linkedHashMap2.put("variables", zn1Var2.z1());
            if (zBooleanValue2) {
                linkedHashMap2.put("query", puaVar.b());
            }
            zn1 zn1Var3 = new zn1();
            so1 so1Var2 = new so1(zn1Var3);
            so1Var2.j();
            if (zBooleanValue) {
                so1Var2.u0("persistedQuery");
                so1Var2.j();
                so1Var2.u0("version");
                z = true;
                so1Var2.F(1);
                so1Var2.u0("sha256Hash");
                so1Var2.T0(puaVar.id());
                so1Var2.t();
            } else {
                z = true;
            }
            if (z2) {
                so1Var2.u0("clientLibrary");
                so1Var2.j();
                so1Var2.u0("name");
                so1Var2.T0("apollo-kotlin");
                so1Var2.u0("version");
                so1Var2.T0("4.4.2");
                so1Var2.t();
            }
            so1Var2.t();
            String strZ1 = zn1Var3.z1();
            if (strZ1.length() != 0) {
                linkedHashMap2.put("extensions", strZ1);
            }
            str.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            boolean zL = zve.L(str, CoreFeature.DEFAULT_APP_VERSION, false);
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (zL) {
                    sb.append('&');
                } else {
                    sb.append(TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR);
                    zL = z;
                }
                sb.append(hwf.e((String) entry.getKey()));
                sb.append('=');
                sb.append(hwf.e((String) entry.getValue()));
            }
            yl6.a aVar2 = new yl6.a(sl6.a, sb.toString());
            aVar2.d.add(new nl6("Apollo-Require-Preflight", "true"));
            aVar = aVar2;
        }
        ArrayList arrayList2 = aVar.d;
        arrayList2.addAll(arrayList);
        k15 k15VarD = aVar.e.d(k15Var);
        aVar.e = k15VarD;
        return new kjd(new vl6(this, new yl6(aVar.a, aVar.b, arrayList2, aVar.c, k15VarD), rh0Var, lb3Var, null));
    }

    @Override // defpackage.cha
    public final void dispose() {
        Iterator<T> it = this.c.iterator();
        while (it.hasNext()) {
            ((ql6) it.next()).getClass();
        }
        this.b.close();
    }
}
