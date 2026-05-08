package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kpe extends ipe {
    public final long a;
    public final long b;
    public final List<a> c;

    public static final class a {
    }

    public kpe(long j, long j2, List list) {
        this.a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
    }

    @Override // defpackage.ipe
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return r6.d(this.b, " }", sb);
    }
}
