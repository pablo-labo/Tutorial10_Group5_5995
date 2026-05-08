package defpackage;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class vqf extends hd0 {
    public final d9a e;
    public final JavaOnlyMap f;
    public final int g;
    public final int h;
    public final int i;

    public vqf(ReadableMap readableMap, d9a d9aVar) {
        this.e = d9aVar;
        this.f = JavaOnlyMap.INSTANCE.deepClone(readableMap.getMap("animationConfig"));
        this.g = readableMap.getInt("animationId");
        this.h = readableMap.getInt("toValue");
        this.i = readableMap.getInt("value");
    }

    @Override // defpackage.hd0
    public final String d() {
        StringBuilder sbF = uz.f("TrackingAnimatedNode[", this.d, "]: animationID: ", this.g, " toValueNode: ");
        uz.i(sbF, this.h, " valueNode: ", this.i, " animationConfig: ");
        sbF.append(this.f);
        return sbF.toString();
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
    @Override // defpackage.hd0
    public final void e() {
        int i = this.h;
        d9a d9aVar = this.e;
        hd0 hd0VarJ = d9aVar.j(i);
        elg elgVar = hd0VarJ instanceof elg ? (elg) hd0VarJ : null;
        JavaOnlyMap javaOnlyMap = this.f;
        if (elgVar != null) {
            javaOnlyMap.putDouble("toValue", elgVar.g());
        } else {
            javaOnlyMap.putNull("toValue");
        }
        d9aVar.r(this.g, javaOnlyMap, null, this.i);
    }
}
