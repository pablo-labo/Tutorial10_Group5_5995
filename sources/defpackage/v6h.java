package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class v6h extends mj8 implements Function2<Integer, Long, j6g> {
    final /* synthetic */ luc<Long> $ntfsCreatedAtFiletime;
    final /* synthetic */ luc<Long> $ntfsLastAccessedAtFiletime;
    final /* synthetic */ luc<Long> $ntfsLastModifiedAtFiletime;
    final /* synthetic */ to1 $this_readCentralDirectoryZipEntry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6h(luc<Long> lucVar, to1 to1Var, luc<Long> lucVar2, luc<Long> lucVar3) {
        super(2);
        this.$ntfsLastModifiedAtFiletime = lucVar;
        this.$this_readCentralDirectoryZipEntry = to1Var;
        this.$ntfsLastAccessedAtFiletime = lucVar2;
        this.$ntfsCreatedAtFiletime = lucVar3;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(Integer num, Long l) throws IOException {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        if (iIntValue == 1) {
            luc<Long> lucVar = this.$ntfsLastModifiedAtFiletime;
            if (lucVar.element != null) {
                r40.h("bad zip: NTFS extra attribute tag 0x0001 repeated");
                return null;
            }
            if (jLongValue != 24) {
                r40.h("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                return null;
            }
            lucVar.element = Long.valueOf(this.$this_readCentralDirectoryZipEntry.q0());
            this.$ntfsLastAccessedAtFiletime.element = Long.valueOf(this.$this_readCentralDirectoryZipEntry.q0());
            this.$ntfsCreatedAtFiletime.element = Long.valueOf(this.$this_readCentralDirectoryZipEntry.q0());
        }
        return j6g.a;
    }
}
