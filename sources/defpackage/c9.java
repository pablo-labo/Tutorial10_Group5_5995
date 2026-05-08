package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import defpackage.c9;
import defpackage.kv8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c9 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public static final class a<O> {
        public final n8<O> a;
        public final o8<?, O> b;

        public a(o8 o8Var, n8 n8Var) {
            n8Var.getClass();
            o8Var.getClass();
            this.a = n8Var;
            this.b = o8Var;
        }
    }

    public static final class b {
        public final kv8 a;
        public final ArrayList b = new ArrayList();

        public b(kv8 kv8Var) {
            this.a = kv8Var;
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.LinkedHashMap r0 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.LinkedHashMap r0 = r3.e
            java.lang.Object r0 = r0.get(r4)
            c9$a r0 = (c9.a) r0
            if (r0 == 0) goto L1d
            n8<O> r1 = r0.a
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = r3.d
            boolean r2 = r1.contains(r4)
            if (r2 == 0) goto L37
            n8<O> r3 = r0.a
            o8<?, O> r0 = r0.b
            java.lang.Object r5 = r0.c(r6, r5)
            r3.c(r5)
            r1.remove(r4)
            goto L46
        L37:
            java.util.LinkedHashMap r0 = r3.f
            r0.remove(r4)
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r6, r5)
            android.os.Bundle r3 = r3.g
            r3.putParcelable(r4, r0)
        L46:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.a(int, int, android.content.Intent):boolean");
    }

    public abstract void b(int i, o8 o8Var, Object obj);

    public final e9 c(final String str, zv8 zv8Var, final o8 o8Var, final n8 n8Var) {
        str.getClass();
        o8Var.getClass();
        n8Var.getClass();
        kv8 lifecycle = zv8Var.getLifecycle();
        if (lifecycle.b().compareTo(kv8.b.d) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(zv8Var);
            kv8.b bVarB = lifecycle.b();
            sb.append(" is attempting to register while current state is ");
            sb.append(bVarB);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        b bVar = (b) linkedHashMap.get(str);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        uv8 uv8Var = new uv8() { // from class: b9
            @Override // defpackage.uv8
            public final void G(zv8 zv8Var2, kv8.a aVar) {
                c9 c9Var = this.a;
                LinkedHashMap linkedHashMap2 = c9Var.e;
                kv8.a aVar2 = kv8.a.ON_START;
                String str2 = str;
                if (aVar2 != aVar) {
                    if (kv8.a.ON_STOP == aVar) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (kv8.a.ON_DESTROY == aVar) {
                            c9Var.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = c9Var.g;
                LinkedHashMap linkedHashMap3 = c9Var.f;
                o8 o8Var2 = o8Var;
                n8 n8Var2 = n8Var;
                linkedHashMap2.put(str2, new c9.a(o8Var2, n8Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    n8Var2.c(obj);
                }
                ActivityResult activityResult = (ActivityResult) wp1.a(str2, bundle);
                if (activityResult != null) {
                    bundle.remove(str2);
                    n8Var2.c(o8Var2.c(activityResult.b, activityResult.a));
                }
            }
        };
        bVar.a.a(uv8Var);
        bVar.b.add(uv8Var);
        linkedHashMap.put(str, bVar);
        return new e9(this, str, o8Var);
    }

    public final f9 d(String str, o8 o8Var, n8 n8Var) {
        str.getClass();
        o8Var.getClass();
        e(str);
        this.e.put(str, new a(o8Var, n8Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            n8Var.c(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) wp1.a(str, bundle);
        if (activityResult != null) {
            bundle.remove(str);
            n8Var.c(o8Var.c(activityResult.b, activityResult.a));
        }
        return new f9(this, str, o8Var);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (vp2) v6e.N(d9.a)) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        s6.j("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbM = akb.m("Dropping pending result for request ", str, ": ");
            sbM.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbM.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) wp1.a(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        b bVar = (b) linkedHashMap2.get(str);
        if (bVar != null) {
            ArrayList arrayList = bVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.a.c((uv8) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
