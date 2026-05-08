package com.infra.autocompleteclient.jsonmodels;

import defpackage.ewa;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.w20;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/Match;", "", "Companion", "$serializer", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class Match {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final int a;
    public final int b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/Match$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/autocompleteclient/jsonmodels/Match;", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public final KSerializer<Match> serializer() {
            return Match$$serializer.INSTANCE;
        }
    }

    @sy3
    public /* synthetic */ Match(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            ewa.M(i, 3, Match$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Match)) {
            return false;
        }
        Match match = (Match) obj;
        return this.a == match.a && this.b == match.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Match(start=");
        sb.append(this.a);
        sb.append(", end=");
        return w20.k(sb, this.b, ")");
    }
}
