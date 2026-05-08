package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w6h extends mj8 implements Function2<Integer, Long, j6g> {
    final /* synthetic */ kuc $compressedSize;
    final /* synthetic */ huc $hasZip64Extra;
    final /* synthetic */ luc<Long> $ntfsCreatedAtFiletime;
    final /* synthetic */ luc<Long> $ntfsLastAccessedAtFiletime;
    final /* synthetic */ luc<Long> $ntfsLastModifiedAtFiletime;
    final /* synthetic */ kuc $offset;
    final /* synthetic */ long $requiredZip64ExtraSize;
    final /* synthetic */ kuc $size;
    final /* synthetic */ to1 $this_readCentralDirectoryZipEntry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6h(huc hucVar, long j, kuc kucVar, uqc uqcVar, kuc kucVar2, kuc kucVar3, luc lucVar, luc lucVar2, luc lucVar3) {
        super(2);
        this.$hasZip64Extra = hucVar;
        this.$requiredZip64ExtraSize = j;
        this.$size = kucVar;
        this.$this_readCentralDirectoryZipEntry = uqcVar;
        this.$compressedSize = kucVar2;
        this.$offset = kucVar3;
        this.$ntfsLastModifiedAtFiletime = lucVar;
        this.$ntfsLastAccessedAtFiletime = lucVar2;
        this.$ntfsCreatedAtFiletime = lucVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(Integer num, Long l) throws IOException {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        if (iIntValue == 1) {
            huc hucVar = this.$hasZip64Extra;
            if (hucVar.element) {
                r40.h("bad zip: zip64 extra repeated");
                return null;
            }
            hucVar.element = true;
            if (jLongValue < this.$requiredZip64ExtraSize) {
                r40.h("bad zip: zip64 extra too short");
                return null;
            }
            kuc kucVar = this.$size;
            long jQ0 = kucVar.element;
            if (jQ0 == 4294967295L) {
                jQ0 = this.$this_readCentralDirectoryZipEntry.q0();
            }
            kucVar.element = jQ0;
            kuc kucVar2 = this.$compressedSize;
            kucVar2.element = kucVar2.element == 4294967295L ? this.$this_readCentralDirectoryZipEntry.q0() : 0L;
            kuc kucVar3 = this.$offset;
            kucVar3.element = kucVar3.element == 4294967295L ? this.$this_readCentralDirectoryZipEntry.q0() : 0L;
        } else if (iIntValue == 10) {
            if (jLongValue < 4) {
                r40.h("bad zip: NTFS extra too short");
                return null;
            }
            this.$this_readCentralDirectoryZipEntry.skip(4L);
            to1 to1Var = this.$this_readCentralDirectoryZipEntry;
            y6h.e(to1Var, (int) (jLongValue - 4), new v6h(this.$ntfsLastModifiedAtFiletime, to1Var, this.$ntfsLastAccessedAtFiletime, this.$ntfsCreatedAtFiletime));
        }
        return j6g.a;
    }
}
