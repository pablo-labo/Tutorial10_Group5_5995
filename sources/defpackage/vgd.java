package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class vgd extends mj8 implements gu5<j6g> {
    final /* synthetic */ KSerializer<Object> $this_generateRoutePattern;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgd(KSerializer<Object> kSerializer) {
        super(0);
        this.$this_generateRoutePattern = kSerializer;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
        yd8 yd8VarM = nn2.m(this.$this_generateRoutePattern.get$$serialDesc());
        throw new IllegalArgumentException(l6.i(sb, yd8VarM != null ? yd8VarM.r() : null, ". Routes can only be generated from concrete classes or objects."));
    }
}
