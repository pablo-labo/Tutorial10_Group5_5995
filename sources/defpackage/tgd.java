package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class tgd extends mj8 implements gu5<j6g> {
    final /* synthetic */ KSerializer<Object> $this_generateNavArguments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgd(KSerializer<Object> kSerializer) {
        super(0);
        this.$this_generateNavArguments = kSerializer;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + this.$this_generateNavArguments + ". Arguments can only be generated from concrete classes or objects.");
    }
}
