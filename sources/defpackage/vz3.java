package defpackage;

import defpackage.mz3;
import defpackage.x62;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class vz3 implements rz3 {
    public static final /* synthetic */ qf8<Object>[] Y;
    public final uz3 A;
    public final uz3 B;
    public final uz3 C;
    public final uz3 D;
    public final uz3 E;
    public final uz3 F;
    public final uz3 G;
    public final uz3 H;
    public final uz3 I;
    public final uz3 J;
    public final uz3 K;
    public final uz3 L;
    public final uz3 M;
    public final uz3 N;
    public final uz3 O;
    public final uz3 P;
    public final uz3 Q;
    public final uz3 R;
    public final uz3 S;
    public final uz3 T;
    public final uz3 U;
    public final uz3 V;
    public final uz3 W;
    public final uz3 X;
    public boolean a;
    public final uz3 b = new uz3(x62.c.a, this);
    public final uz3 c;
    public final uz3 d;
    public final uz3 e;
    public final uz3 f;
    public final uz3 g;
    public final uz3 h;
    public final uz3 i;
    public final uz3 j;
    public final uz3 k;
    public final uz3 l;
    public final uz3 m;
    public final uz3 n;
    public final uz3 o;
    public final uz3 p;
    public final uz3 q;
    public final uz3 r;
    public final uz3 s;
    public final uz3 t;
    public final uz3 u;
    public final uz3 v;
    public final uz3 w;
    public final uz3 x;
    public final uz3 y;
    public final uz3 z;

    static {
        w3a w3aVar = new w3a(vz3.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        iwc iwcVar = fwc.a;
        Y = new qf8[]{iwcVar.e(w3aVar), r40.b(vz3.class, "withDefinedIn", "getWithDefinedIn()Z", 0, iwcVar), r40.b(vz3.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0, iwcVar), r40.b(vz3.class, "modifiers", "getModifiers()Ljava/util/Set;", 0, iwcVar), r40.b(vz3.class, "startFromName", "getStartFromName()Z", 0, iwcVar), r40.b(vz3.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0, iwcVar), r40.b(vz3.class, "debugMode", "getDebugMode()Z", 0, iwcVar), r40.b(vz3.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0, iwcVar), r40.b(vz3.class, "verbose", "getVerbose()Z", 0, iwcVar), r40.b(vz3.class, "unitReturnType", "getUnitReturnType()Z", 0, iwcVar), r40.b(vz3.class, "withoutReturnType", "getWithoutReturnType()Z", 0, iwcVar), r40.b(vz3.class, "enhancedTypes", "getEnhancedTypes()Z", 0, iwcVar), r40.b(vz3.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0, iwcVar), r40.b(vz3.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0, iwcVar), r40.b(vz3.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0, iwcVar), r40.b(vz3.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0, iwcVar), r40.b(vz3.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0, iwcVar), r40.b(vz3.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0, iwcVar), r40.b(vz3.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0, iwcVar), r40.b(vz3.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0, iwcVar), r40.b(vz3.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0, iwcVar), r40.b(vz3.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0, iwcVar), r40.b(vz3.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0, iwcVar), r40.b(vz3.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0, iwcVar), r40.b(vz3.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0, iwcVar), r40.b(vz3.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0, iwcVar), r40.b(vz3.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0, iwcVar), r40.b(vz3.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0, iwcVar), r40.b(vz3.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0, iwcVar), r40.b(vz3.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0, iwcVar), r40.b(vz3.class, "receiverAfterName", "getReceiverAfterName()Z", 0, iwcVar), r40.b(vz3.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0, iwcVar), r40.b(vz3.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0, iwcVar), r40.b(vz3.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0, iwcVar), r40.b(vz3.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0, iwcVar), r40.b(vz3.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0, iwcVar), r40.b(vz3.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0, iwcVar), r40.b(vz3.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0, iwcVar), r40.b(vz3.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0, iwcVar), r40.b(vz3.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0, iwcVar), r40.b(vz3.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0, iwcVar), r40.b(vz3.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0, iwcVar), r40.b(vz3.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0, iwcVar), r40.b(vz3.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0, iwcVar), r40.b(vz3.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0, iwcVar), r40.b(vz3.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0, iwcVar), r40.b(vz3.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0, iwcVar), r40.b(vz3.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0, iwcVar), r40.b(vz3.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0, iwcVar), r40.b(vz3.class, "informativeErrorType", "getInformativeErrorType()Z", 0, iwcVar)};
    }

    public vz3() {
        Boolean bool = Boolean.TRUE;
        this.c = new uz3(bool, this);
        this.d = new uz3(bool, this);
        this.e = new uz3(qz3.a, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new uz3(bool2, this);
        this.g = new uz3(bool2, this);
        this.h = new uz3(bool2, this);
        this.i = new uz3(bool2, this);
        this.j = new uz3(bool2, this);
        this.k = new uz3(bool, this);
        this.l = new uz3(bool2, this);
        this.m = new uz3(bool2, this);
        this.n = new uz3(bool2, this);
        this.o = new uz3(bool, this);
        this.p = new uz3(bool, this);
        this.q = new uz3(bool2, this);
        this.r = new uz3(bool2, this);
        this.s = new uz3(bool2, this);
        this.t = new uz3(bool2, this);
        this.u = new uz3(bool2, this);
        this.v = new uz3(null, this);
        this.w = new uz3(bool2, this);
        this.x = new uz3(bool2, this);
        this.y = new uz3(sz3.a, this);
        this.z = new uz3(tz3.b, this);
        this.A = new uz3(bool, this);
        this.B = new uz3(hxa.b, this);
        this.C = new uz3(mz3.a.C0326a.a, this);
        this.D = new uz3(z1d.a, this);
        this.E = new uz3(s3b.a, this);
        this.F = new uz3(bool2, this);
        this.G = new uz3(bool2, this);
        this.H = new uz3(y3c.a, this);
        this.I = new uz3(bool2, this);
        this.J = new uz3(bool2, this);
        this.K = new uz3(is4.a, this);
        this.L = new uz3(c15.a, this);
        this.M = new uz3(null, this);
        this.N = new uz3(te0.NO_ARGUMENTS, this);
        this.O = new uz3(bool2, this);
        this.P = new uz3(bool, this);
        this.Q = new uz3(bool, this);
        this.R = new uz3(bool2, this);
        this.S = new uz3(bool2, this);
        this.T = new uz3(bool, this);
        this.U = new uz3(bool, this);
        this.V = new uz3(bool2, this);
        this.W = new uz3(bool2, this);
        this.X = new uz3(bool, this);
    }

    @Override // defpackage.rz3
    public final void a() {
        this.F.c(Y[30], this, Boolean.TRUE);
    }

    @Override // defpackage.rz3
    public final void b() {
        this.G.c(Y[31], this, Boolean.TRUE);
    }

    @Override // defpackage.rz3
    public final void c() {
        this.w.c(Y[21], this, Boolean.TRUE);
    }

    @Override // defpackage.rz3
    public final void d(x62 x62Var) {
        this.b.c(Y[0], this, x62Var);
    }

    @Override // defpackage.rz3
    public final void e() {
        this.f.c(Y[4], this, Boolean.TRUE);
    }

    @Override // defpackage.rz3
    public final Set<mq5> f() {
        qf8<Object> qf8Var = Y[36];
        uz3 uz3Var = this.L;
        uz3Var.getClass();
        qf8Var.getClass();
        return (Set) uz3Var.a;
    }

    @Override // defpackage.rz3
    public final void g() {
        this.x.c(Y[22], this, Boolean.TRUE);
    }

    @Override // defpackage.rz3
    public final void h() {
        this.h.c(Y[6], this, Boolean.TRUE);
    }

    @Override // defpackage.rz3
    public final void i(Set<? extends qz3> set) {
        set.getClass();
        this.e.c(Y[3], this, set);
    }

    @Override // defpackage.rz3
    public final void j(LinkedHashSet linkedHashSet) {
        this.L.c(Y[36], this, linkedHashSet);
    }

    @Override // defpackage.rz3
    public final void k(s3b s3bVar) {
        this.E.c(Y[29], this, s3bVar);
    }

    @Override // defpackage.rz3
    public final void l() {
        this.c.c(Y[1], this, Boolean.FALSE);
    }

    @Override // defpackage.rz3
    public final void m() {
        this.D.c(Y[28], this, z1d.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final te0 n() {
        qf8<Object> qf8Var = Y[38];
        uz3 uz3Var = this.N;
        uz3Var.getClass();
        qf8Var.getClass();
        return (te0) uz3Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o() {
        qf8<Object> qf8Var = Y[6];
        uz3 uz3Var = this.h;
        uz3Var.getClass();
        qf8Var.getClass();
        return ((Boolean) uz3Var.a).booleanValue();
    }
}
