package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Trace;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.Exceptions$AppContextLost;
import expo.modules.kotlin.uuidv5.InvalidNamespaceException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnz2;", "Lsx9;", "<init>", "()V", "Lwx9;", "a", "()Lwx9;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nz2 extends sx9 {

    public static final class a implements Function2<Object[], p3c, j6g> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object[] objArr, p3c p3cVar) throws CodedException {
            ekc reactDelegate;
            p3c p3cVar2 = p3cVar;
            objArr.getClass();
            p3cVar2.getClass();
            Activity activityE = nz2.this.b().e();
            ljc ljcVar = activityE instanceof ljc ? (ljc) activityE : null;
            if (ljcVar != null && (reactDelegate = ljcVar.q0.getReactDelegate()) != null) {
                reactDelegate.g();
            }
            return j6g.a;
        }
    }

    public static final class b implements gu5<zf8> {
        public static final b a = new b();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class c implements Function1<Object[], j6g> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object[] objArr) throws CodedException {
            ekc reactDelegate;
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Activity activityE = nz2.this.b().e();
            ljc ljcVar = activityE instanceof ljc ? (ljc) activityE : null;
            if (ljcVar != null && (reactDelegate = ljcVar.q0.getReactDelegate()) != null) {
                reactDelegate.g();
            }
            return j6g.a;
        }
    }

    public static final class d implements gu5<zf8> {
        public static final d a = new d();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class e implements gu5<zf8> {
        public static final e a = new e();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class f implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws NoSuchAlgorithmException, InvalidNamespaceException {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            String str = (String) objArr2[1];
            String str2 = (String) obj;
            try {
                UUID uuidFromString = UUID.fromString(str);
                uuidFromString.getClass();
                str2.getClass();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                byte[] bArrArray = byteBufferWrap.array();
                bArrArray.getClass();
                messageDigest.update(bArrArray);
                byte[] bytes = str2.getBytes(a32.b);
                bytes.getClass();
                messageDigest.update(bytes);
                byte[] bArrDigest = messageDigest.digest();
                bArrDigest[6] = (byte) ((bArrDigest[6] & 15) | 80);
                bArrDigest[8] = (byte) ((bArrDigest[8] & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrDigest);
                return new UUID(byteBufferWrap2.getLong(), byteBufferWrap2.getLong()).toString();
            } catch (IllegalArgumentException unused) {
                str.getClass();
                throw new InvalidNamespaceException(l5.m("Namespace: `", str, "` is not a valid namespace. Namespace should be a valid UUID string"), null);
            }
        }
    }

    public static final class g implements gu5<zf8> {
        public static final g a = new g();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    public static final class h implements gu5<zf8> {
        public static final h a = new h();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.b(String.class);
        }
    }

    public static final class i implements Function1<Object[], Object> {
        public i() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            Object[] objArr2 = objArr;
            objArr2.getClass();
            Object obj = objArr2[0];
            String str = (String) objArr2[1];
            zx9<?> zx9VarB = nz2.this.c().c.b((String) obj);
            LinkedHashMap linkedHashMap = null;
            if (zx9VarB != null) {
                Map<String, rqg> map = zx9VarB.b.c;
                if (str == null) {
                    str = "DEFAULT_MODULE_VIEW";
                }
                rqg rqgVar = map.get(str);
                if (rqgVar != null) {
                    Set<String> setKeySet = rqgVar.d.keySet();
                    int iV = kc9.V(t92.r0(setKeySet, 10));
                    if (iV < 16) {
                        iV = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iV);
                    for (Object obj2 : setKeySet) {
                        linkedHashMap2.put(obj2, Boolean.TRUE);
                    }
                    c00 c00Var = rqgVar.f;
                    if (c00Var != null) {
                        String[] strArr = (String[]) c00Var.a;
                        int iV2 = kc9.V(strArr.length);
                        linkedHashMap = new LinkedHashMap(iV2 >= 16 ? iV2 : 16);
                        for (String str2 : strArr) {
                            Pair pair = new Pair(ypd.I(str2), j6.c("registrationName", str2));
                            linkedHashMap.put(pair.d(), pair.e());
                        }
                    }
                    return lc9.a0(new Pair("validAttributes", linkedHashMap2), new Pair("directEventTypes", linkedHashMap));
                }
            }
            return null;
        }
    }

    public static final class j implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            return UUID.randomUUID().toString();
        }
    }

    public static final class k implements Function1<Object[], Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) {
            objArr.getClass();
            List listK0 = zve.k0((CharSequence) z92.O0(zve.k0("3.0.29", new String[]{"-"})), new String[]{"."});
            ArrayList arrayList = new ArrayList(t92.r0(listK0, 10));
            Iterator it = listK0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            return lc9.a0(new Pair("version", "3.0.29"), new Pair("major", Integer.valueOf(((Number) arrayList.get(0)).intValue())), new Pair("minor", Integer.valueOf(((Number) arrayList.get(1)).intValue())), new Pair("patch", Integer.valueOf(((Number) arrayList.get(2)).intValue())));
        }
    }

    public static final class l implements Function1<Object[], Object> {
        public l() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws Exceptions$AppContextLost {
            objArr.getClass();
            ReactApplicationContext reactApplicationContextD = nz2.this.b().d();
            if (reactApplicationContextD == null) {
                throw new Exceptions$AppContextLost();
            }
            return Uri.fromFile(reactApplicationContextD.getCacheDir()) + "/";
        }
    }

    public static final class m implements Function1<Object[], Object> {
        public m() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object[] objArr) throws Exceptions$AppContextLost {
            objArr.getClass();
            ReactApplicationContext reactApplicationContextD = nz2.this.b().d();
            if (reactApplicationContextD == null) {
                throw new Exceptions$AppContextLost();
            }
            return Uri.fromFile(reactApplicationContextD.getFilesDir()) + "/";
        }
    }

    @Override // defpackage.sx9
    public final wx9 a() {
        vx9 vx9Var;
        qf0 ch7Var;
        Trace.beginSection(jpf.g("[ExpoModulesCore] ".concat(nz2.class + ".ModuleDefinition")));
        try {
            vx9 vx9Var2 = new vx9(this, 2);
            LinkedHashMap linkedHashMap = vx9Var2.d;
            LinkedHashMap linkedHashMap2 = vx9Var2.h;
            b4c b4cVar = new b4c("expoModulesCoreVersion");
            rf0[] rf0VarArr = new rf0[0];
            LinkedHashMap linkedHashMap3 = had.a;
            iwc iwcVar = fwc.a;
            gad gadVar = (gad) linkedHashMap3.get(iwcVar.b(Map.class));
            if (gadVar == null) {
                gadVar = new gad(iwcVar.b(Map.class));
                linkedHashMap3.put(iwcVar.b(Map.class), gadVar);
            }
            b4cVar.b = new a2f("get", rf0VarArr, gadVar, new k());
            linkedHashMap2.put("expoModulesCoreVersion", b4cVar);
            b4c b4cVar2 = new b4c("cacheDir");
            rf0[] rf0VarArr2 = new rf0[0];
            gad gadVar2 = (gad) linkedHashMap3.get(iwcVar.b(String.class));
            if (gadVar2 == null) {
                gadVar2 = new gad(iwcVar.b(String.class));
                linkedHashMap3.put(iwcVar.b(String.class), gadVar2);
            }
            b4cVar2.b = new a2f("get", rf0VarArr2, gadVar2, new l());
            linkedHashMap2.put("cacheDir", b4cVar2);
            b4c b4cVar3 = new b4c("documentsDir");
            rf0[] rf0VarArr3 = new rf0[0];
            gad gadVar3 = (gad) linkedHashMap3.get(iwcVar.b(String.class));
            if (gadVar3 == null) {
                gadVar3 = new gad(iwcVar.b(String.class));
                linkedHashMap3.put(iwcVar.b(String.class), gadVar3);
            }
            b4cVar3.b = new a2f("get", rf0VarArr3, gadVar3, new m());
            linkedHashMap2.put("documentsDir", b4cVar3);
            rf0[] rf0VarArr4 = new rf0[0];
            gad gadVar4 = (gad) linkedHashMap3.get(iwcVar.b(Object.class));
            if (gadVar4 == null) {
                gadVar4 = new gad(iwcVar.b(Object.class));
                linkedHashMap3.put(iwcVar.b(Object.class), gadVar4);
            }
            linkedHashMap.put("uuidv4", new a2f("uuidv4", rf0VarArr4, gadVar4, new j()));
            hb9 hb9Var = tf0.a;
            yd8 yd8VarB = iwcVar.b(String.class);
            Boolean bool = Boolean.FALSE;
            Pair pair = new Pair(yd8VarB, bool);
            hb9 hb9Var2 = tf0.a;
            rf0 rf0Var = (rf0) hb9Var2.get(pair);
            if (rf0Var == null) {
                rf0Var = new rf0(new xp8(iwcVar.b(String.class), false, d.a), null);
            }
            rf0 rf0Var2 = (rf0) hb9Var2.get(new Pair(iwcVar.b(String.class), bool));
            if (rf0Var2 == null) {
                vx9Var = vx9Var2;
                rf0Var2 = new rf0(new xp8(iwcVar.b(String.class), false, e.a), null);
            } else {
                vx9Var = vx9Var2;
            }
            rf0[] rf0VarArr5 = {rf0Var, rf0Var2};
            gad gadVar5 = (gad) linkedHashMap3.get(iwcVar.b(String.class));
            if (gadVar5 == null) {
                gadVar5 = new gad(iwcVar.b(String.class));
                linkedHashMap3.put(iwcVar.b(String.class), gadVar5);
            }
            linkedHashMap.put("uuidv5", new a2f("uuidv5", rf0VarArr5, gadVar5, new f()));
            rf0 rf0Var3 = (rf0) hb9Var2.get(new Pair(iwcVar.b(String.class), bool));
            if (rf0Var3 == null) {
                rf0Var3 = new rf0(new xp8(iwcVar.b(String.class), false, g.a), null);
            }
            rf0 rf0Var4 = (rf0) hb9Var2.get(new Pair(iwcVar.b(String.class), Boolean.TRUE));
            if (rf0Var4 == null) {
                rf0Var4 = new rf0(new xp8(iwcVar.b(String.class), true, h.a), null);
            }
            rf0[] rf0VarArr6 = {rf0Var3, rf0Var4};
            gad gadVar6 = (gad) linkedHashMap3.get(iwcVar.b(Map.class));
            if (gadVar6 == null) {
                gadVar6 = new gad(iwcVar.b(Map.class));
                linkedHashMap3.put(iwcVar.b(Map.class), gadVar6);
            }
            linkedHashMap.put("getViewConfig", new a2f("getViewConfig", rf0VarArr6, gadVar6, new i()));
            if (String.class.equals(p3c.class)) {
                ch7Var = new ev0("reloadAppAsync", new rf0[0], new a());
            } else {
                rf0 rf0Var5 = (rf0) hb9Var2.get(new Pair(iwcVar.b(String.class), bool));
                if (rf0Var5 == null) {
                    rf0Var5 = new rf0(new xp8(iwcVar.b(String.class), false, b.a), null);
                }
                rf0[] rf0VarArr7 = {rf0Var5};
                c cVar = new c();
                ch7Var = j6g.class.equals(Integer.TYPE) ? new ch7("reloadAppAsync", rf0VarArr7, cVar) : j6g.class.equals(Boolean.TYPE) ? new hi1("reloadAppAsync", rf0VarArr7, cVar) : j6g.class.equals(Double.TYPE) ? new s84("reloadAppAsync", rf0VarArr7, cVar) : j6g.class.equals(Float.TYPE) ? new ci5("reloadAppAsync", rf0VarArr7, cVar) : j6g.class.equals(String.class) ? new zue("reloadAppAsync", rf0VarArr7, cVar) : new o7g("reloadAppAsync", rf0VarArr7, cVar);
            }
            vx9 vx9Var3 = vx9Var;
            vx9Var3.f.put("reloadAppAsync", ch7Var);
            return vx9Var3.k();
        } finally {
            Trace.endSection();
        }
    }
}
