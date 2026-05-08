package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import defpackage.kv8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ok0 {
    public final gk0 a;
    public Random b = new Random();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public ArrayList<String> f = new ArrayList<>();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final Bundle i = new Bundle();

    public static final class a<I extends Serializable, O> {
        public final jk0<I, O> a;
        public final n8<O> b;
        public final ik0<I, O> c;

        public a(jk0 jk0Var, kk0 kk0Var, ik0 ik0Var) {
            this.a = jk0Var;
            this.b = kk0Var;
            this.c = ik0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && wl7.b(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            n8<O> n8Var = this.b;
            return this.c.hashCode() + ((iHashCode + (n8Var == null ? 0 : n8Var.hashCode())) * 31);
        }

        public final String toString() {
            return "CallbacksAndContract(fallbackCallback=" + this.a + ", mainCallback=" + this.b + ", contract=" + this.c + ")";
        }
    }

    public static final class b {
        public final kv8 a;
        public final ArrayList<uv8> b;

        public b(kv8 kv8Var) {
            kv8Var.getClass();
            this.a = kv8Var;
            this.b = new ArrayList<>();
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kv8.a.values().length];
            try {
                iArr[kv8.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kv8.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public ok0(gk0 gk0Var) {
        this.a = gk0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(ok0 ok0Var, String str, zv8 zv8Var, kv8.a aVar) {
        Integer num;
        HashMap map = ok0Var.g;
        Bundle bundle = ok0Var.i;
        int i = c.a[aVar.ordinal()];
        if (i == 1) {
            a aVar2 = (a) map.get(str);
            if (aVar2 == null) {
                return;
            }
            ActivityResult activityResult = (ActivityResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, ActivityResult.class) : bundle.getParcelable(str));
            if (activityResult != null) {
                bundle.remove(str);
                Object obj = ok0Var.h.get(str);
                obj.getClass();
                Serializable serializable = (Serializable) obj;
                Object objB = aVar2.c.b(serializable, activityResult.a, activityResult.b);
                n8<O> n8Var = aVar2.b;
                if (n8Var != 0) {
                    n8Var.c(objB);
                    return;
                } else {
                    aVar2.a.a(serializable, objB);
                    return;
                }
            }
            return;
        }
        if (i != 2) {
            return;
        }
        HashMap map2 = ok0Var.e;
        if (!ok0Var.f.contains(str) && (num = (Integer) ok0Var.d.remove(str)) != null) {
        }
        map.remove(str);
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + " : " + (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, ActivityResult.class) : bundle.getParcelable(str)));
            bundle.remove(str);
        }
        b bVar = (b) map2.get(str);
        if (bVar != null) {
            ArrayList<uv8> arrayList = bVar.b;
            Iterator<uv8> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.a.c(it.next());
            }
            arrayList.clear();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void b(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.util.HashMap r0 = r4.c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto Lf
            return
        Lf:
            java.util.HashMap r0 = r4.g
            java.lang.Object r0 = r0.get(r5)
            ok0$a r0 = (ok0.a) r0
            java.util.HashMap r1 = r4.e
            java.lang.Object r1 = r1.get(r5)
            ok0$b r1 = (ok0.b) r1
            r2 = 0
            if (r1 == 0) goto L2b
            kv8 r1 = r1.a
            if (r1 == 0) goto L2b
            kv8$b r1 = r1.b()
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r0 == 0) goto L30
            n8<O> r2 = r0.b
        L30:
            java.util.HashMap r3 = r4.h
            if (r2 == 0) goto L56
            java.util.ArrayList<java.lang.String> r2 = r4.f
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L56
            java.lang.Object r1 = r3.get(r5)
            r1.getClass()
            java.io.Serializable r1 = (java.io.Serializable) r1
            n8<O> r2 = r0.b
            ik0<I extends java.io.Serializable, O> r0 = r0.c
            java.lang.Object r6 = r0.b(r1, r6, r7)
            r2.c(r6)
            java.util.ArrayList<java.lang.String> r4 = r4.f
            r4.remove(r5)
            goto L8e
        L56:
            if (r1 == 0) goto L84
            kv8$b r2 = kv8.b.d
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L84
            if (r0 == 0) goto L84
            java.util.ArrayList<java.lang.String> r1 = r4.f
            boolean r1 = r1.contains(r5)
            if (r1 == 0) goto L84
            java.lang.Object r1 = r3.get(r5)
            r1.getClass()
            java.io.Serializable r1 = (java.io.Serializable) r1
            jk0<I extends java.io.Serializable, O> r2 = r0.a
            ik0<I extends java.io.Serializable, O> r0 = r0.c
            java.lang.Object r6 = r0.b(r1, r6, r7)
            r2.a(r1, r6)
            java.util.ArrayList<java.lang.String> r4 = r4.f
            r4.remove(r5)
            goto L8e
        L84:
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r7, r6)
            android.os.Bundle r4 = r4.i
            r4.putParcelable(r5, r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok0.b(int, int, android.content.Intent):void");
    }

    public final wi0 c() {
        Activity activityB = this.a.b();
        wi0 wi0Var = activityB instanceof wi0 ? (wi0) activityB : null;
        if (wi0Var != null) {
            return wi0Var;
        }
        l5.q("Current Activity is not available at the moment");
        return null;
    }

    public final <I extends Serializable, O> void d(int i, ik0<I, O> ik0Var, @SuppressLint({"UnknownNullness"}) I i2) {
        Bundle bundleExtra;
        int i3;
        final int i4;
        i2.getClass();
        Intent intentA = ik0Var.a(c(), i2);
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        String action = intentA.getAction();
        if (action == null) {
            i3 = i;
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -1837081951) {
                if (iHashCode == -591152331 && action.equals("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST")) {
                    Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", IntentSenderRequest.class) : intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    parcelableExtra.getClass();
                    IntentSenderRequest intentSenderRequest = (IntentSenderRequest) parcelableExtra;
                    try {
                        i4 = i;
                        try {
                            c().startIntentSenderForResult(intentSenderRequest.a, i4, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
                            j6g j6gVar = j6g.a;
                            return;
                        } catch (IntentSender.SendIntentException e) {
                            e = e;
                            final IntentSender.SendIntentException sendIntentException = e;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: nk0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.b(i4, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                                }
                            });
                            return;
                        }
                    } catch (IntentSender.SendIntentException e2) {
                        e = e2;
                        i4 = i;
                    }
                }
                i3 = i;
            } else {
                i3 = i;
                if (action.equals("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")) {
                    String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    w7.b(c(), stringArrayExtra, i3);
                    return;
                }
            }
        }
        c().startActivityForResult(intentA, i3, bundle);
    }

    public final pk0 e(final String str, wi0 wi0Var, ik0 ik0Var, jk0 jk0Var) {
        int i;
        HashMap map;
        aw8 aw8Var = wi0Var.a;
        this.g.put(str, new a(jk0Var, null, ik0Var));
        HashMap map2 = this.d;
        if (map2.get(str) == null) {
            int iNextInt = this.b.nextInt(2147418112);
            while (true) {
                i = iNextInt + 65536;
                Integer numValueOf = Integer.valueOf(i);
                map = this.c;
                if (!map.containsKey(numValueOf)) {
                    break;
                }
                iNextInt = this.b.nextInt(2147418112);
            }
            map.put(Integer.valueOf(i), str);
            map2.put(str, Integer.valueOf(i));
            j6g j6gVar = j6g.a;
        }
        uv8 uv8Var = new uv8() { // from class: mk0
            @Override // defpackage.uv8
            public final void G(zv8 zv8Var, kv8.a aVar) {
                ok0.a(this.a, str, zv8Var, aVar);
            }
        };
        HashMap map3 = this.e;
        b bVar = (b) map3.get(str);
        if (bVar == null) {
            bVar = new b(aw8Var);
        }
        bVar.a.a(uv8Var);
        bVar.b.add(uv8Var);
        map3.put(str, bVar);
        return new pk0(ik0Var, this, str, jk0Var);
    }

    public final void f(wi0 wi0Var) {
        LinkedHashMap linkedHashMap;
        re3 re3Var = new re3(wi0Var);
        d2f d2fVar = re3Var.c;
        ArrayList<String> stringArrayList = ((Bundle) d2fVar.getValue()).getStringArrayList("launchedKeys");
        if (stringArrayList != null) {
            this.f = stringArrayList;
        }
        LinkedHashMap linkedHashMapB = re3Var.b();
        if (linkedHashMapB != null) {
            this.h.putAll(linkedHashMapB);
        }
        Bundle bundle = ((Bundle) d2fVar.getValue()).getBundle("pendingResult");
        if (bundle != null) {
            this.i.putAll(bundle);
        }
        Serializable serializableA = re3Var.a();
        if (serializableA != null) {
            this.b = (Random) serializableA;
        }
        Bundle bundle2 = ((Bundle) d2fVar.getValue()).getBundle("keyToRequestCode");
        if (bundle2 != null) {
            Set<String> setKeySet = bundle2.keySet();
            setKeySet.getClass();
            Set<String> set = setKeySet;
            int iV = kc9.V(t92.r0(set, 10));
            if (iV < 16) {
                iV = 16;
            }
            linkedHashMap = new LinkedHashMap(iV);
            for (Object obj : set) {
                linkedHashMap.put(obj, Integer.valueOf(bundle2.getInt((String) obj)));
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                this.d.put(str, Integer.valueOf(iIntValue));
                this.c.put(Integer.valueOf(iIntValue), str);
            }
        }
    }
}
