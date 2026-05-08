package com.infra.autocompleteclient.jsonmodels;

import defpackage.ewa;
import defpackage.g7;
import defpackage.o7e;
import defpackage.sy3;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/JobTitleWithConceptsPayload;", "", "Companion", "$serializer", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class JobTitleWithConceptsPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final List<Concept> a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/infra/autocompleteclient/jsonmodels/JobTitleWithConceptsPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/infra/autocompleteclient/jsonmodels/JobTitleWithConceptsPayload;", "autocomplete-client_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public final KSerializer<JobTitleWithConceptsPayload> serializer() {
            return JobTitleWithConceptsPayload$$serializer.INSTANCE;
        }
    }

    @sy3
    public /* synthetic */ JobTitleWithConceptsPayload(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            ewa.M(i, 1, JobTitleWithConceptsPayload$$serializer.INSTANCE.get$$serialDesc());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof JobTitleWithConceptsPayload) && wl7.b(this.a, ((JobTitleWithConceptsPayload) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        List<Concept> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return g7.i(new StringBuilder("JobTitleWithConceptsPayload(concepts="), this.a, ")");
    }
}
