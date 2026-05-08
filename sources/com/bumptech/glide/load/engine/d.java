package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.e;
import defpackage.d64;
import defpackage.fx9;
import defpackage.kg8;
import defpackage.knb;
import defpackage.o6g;
import defpackage.ova;
import defpackage.prf;
import defpackage.w40;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d<Transcode> {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public com.bumptech.glide.c c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public e.c h;
    public ova i;
    public Map<Class<?>, prf<?>> j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public kg8 n;
    public knb o;
    public d64 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                fx9.a aVar = (fx9.a) arrayListB.get(i);
                kg8 kg8Var = aVar.a;
                List<kg8> list = aVar.b;
                if (!arrayList.contains(kg8Var)) {
                    arrayList.add(aVar.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listF = this.c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                fx9.a aVarA = ((fx9) listF.get(i)).a(this.d, this.e, this.f, this.i);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v16 vz8<?, ?, ?>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final <Data> defpackage.vz8<Data, ?, Transcode> c(java.lang.Class<Data> r17) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.d.c(java.lang.Class):vz8");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = (defpackage.zs4<X>) r2.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <X> defpackage.zs4<X> d(X r5) {
        /*
            r4 = this;
            com.bumptech.glide.c r4 = r4.c
            com.bumptech.glide.Registry r4 = r4.a()
            ct4 r4 = r4.b
            java.lang.Class r0 = r5.getClass()
            monitor-enter(r4)
            java.util.ArrayList r1 = r4.a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            ct4$a r2 = (ct4.a) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<T> r3 = r2.a     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L13
            zs4<T> r0 = r2.b     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)
            goto L2f
        L2b:
            r5 = move-exception
            goto L42
        L2d:
            monitor-exit(r4)
            r0 = 0
        L2f:
            if (r0 == 0) goto L32
            return r0
        L32:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r4 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r5 = r5.getClass()
            java.lang.String r0 = "Failed to find source encoder for data class: "
            java.lang.String r5 = defpackage.m6.f(r5, r0)
            r4.<init>(r5)
            throw r4
        L42:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.d.d(java.lang.Object):zs4");
    }

    public final <Z> prf<Z> e(Class<Z> cls) {
        prf<Z> prfVar = (prf) this.j.get(cls);
        if (prfVar == null) {
            Iterator<Map.Entry<Class<?>, prf<?>>> it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, prf<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    prfVar = (prf) next.getValue();
                    break;
                }
            }
        }
        if (prfVar != null) {
            return prfVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return o6g.b;
        }
        w40.m("Missing transformation for ", cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }
}
