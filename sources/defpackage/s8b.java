package defpackage;

import androidx.compose.runtime.h;
import defpackage.stf;

/* JADX INFO: loaded from: classes.dex */
public final class s8b extends u8b<h, olg<Object>> implements t8b {
    public static final s8b d = new s8b(stf.e, 0);

    public static final class a extends w8b<h, olg<Object>> {
        public s8b V;

        @Override // defpackage.w8b, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof h) {
                return super.containsKey((h) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof olg) {
                return super.containsValue((olg) obj);
            }
            return false;
        }

        @Override // defpackage.w8b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final s8b a() {
            Object obj = this.c;
            s8b s8bVar = this.V;
            if (obj != s8bVar.a) {
                this.b = new bf9();
                s8bVar = new s8b(this.c, this.f);
            }
            this.V = s8bVar;
            return s8bVar;
        }

        @Override // defpackage.w8b, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof h) {
                return (olg) super.get((h) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof h) ? obj2 : (olg) super.getOrDefault((h) obj, (olg) obj2);
        }

        @Override // defpackage.w8b, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof h) {
                return (olg) super.remove((h) obj);
            }
            return null;
        }
    }

    @Override // defpackage.sm2
    public final <T> T a(h hVar) {
        return (T) tm2.a(this, hVar);
    }

    @Override // defpackage.u8b
    public final w8b<h, olg<Object>> b() {
        a aVar = new a(this);
        aVar.V = this;
        return aVar;
    }

    @Override // defpackage.t8b
    public final a builder() {
        a aVar = new a(this);
        aVar.V = this;
        return aVar;
    }

    @Override // defpackage.u8b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof h) {
            return super.containsKey((h) obj);
        }
        return false;
    }

    @Override // defpackage.b3, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof olg) {
            return super.containsValue((olg) obj);
        }
        return false;
    }

    @Override // defpackage.u8b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof h) {
            return (olg) super.get((h) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof h) ? obj2 : (olg) super.getOrDefault((h) obj, (olg) obj2);
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
    @Override // defpackage.t8b
    public final s8b m(h hVar, olg olgVar) {
        stf.a aVarU = this.a.u(hVar, hVar.hashCode(), 0, olgVar);
        return aVarU == null ? this : new s8b(aVarU.a, this.b + aVarU.b);
    }
}
