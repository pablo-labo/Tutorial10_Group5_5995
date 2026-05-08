package com.indeed.android.myjobs.data.model;

import defpackage.boa;
import defpackage.g7;
import defpackage.gt0;
import defpackage.mve;
import defpackage.o7e;
import defpackage.p7e;
import defpackage.pd1;
import defpackage.qt8;
import defpackage.vl2;
import defpackage.wl7;
import defpackage.zr4;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0016¨\u0006%"}, d2 = {"Lcom/indeed/android/myjobs/data/model/InterviewPrepProctorPayload;", "", "", "", "targetOccupationSUIDs", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/util/List;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$myjobs_release", "(Lcom/indeed/android/myjobs/data/model/InterviewPrepProctorPayload;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/indeed/android/myjobs/data/model/InterviewPrepProctorPayload;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTargetOccupationSUIDs", "Companion", "$serializer", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InterviewPrepProctorPayload {
    private final List<String> targetOccupationSUIDs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {boa.E(qt8.b, new pd1(11))};

    public /* synthetic */ InterviewPrepProctorPayload(int i, List list, p7e p7eVar) {
        if ((i & 1) == 0) {
            this.targetOccupationSUIDs = zr4.a;
        } else {
            this.targetOccupationSUIDs = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new gt0(mve.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterviewPrepProctorPayload copy$default(InterviewPrepProctorPayload interviewPrepProctorPayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = interviewPrepProctorPayload.targetOccupationSUIDs;
        }
        return interviewPrepProctorPayload.copy(list);
    }

    public static final /* synthetic */ void write$Self$myjobs_release(InterviewPrepProctorPayload self, vl2 output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (!output.m(serialDesc) && wl7.b(self.targetOccupationSUIDs, zr4.a)) {
            return;
        }
        output.y(serialDesc, 0, lazyArr[0].getValue(), self.targetOccupationSUIDs);
    }

    public final List<String> component1() {
        return this.targetOccupationSUIDs;
    }

    public final InterviewPrepProctorPayload copy(List<String> targetOccupationSUIDs) {
        targetOccupationSUIDs.getClass();
        return new InterviewPrepProctorPayload(targetOccupationSUIDs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InterviewPrepProctorPayload) && wl7.b(this.targetOccupationSUIDs, ((InterviewPrepProctorPayload) other).targetOccupationSUIDs);
    }

    public final List<String> getTargetOccupationSUIDs() {
        return this.targetOccupationSUIDs;
    }

    public int hashCode() {
        return this.targetOccupationSUIDs.hashCode();
    }

    public String toString() {
        return g7.h("InterviewPrepProctorPayload(targetOccupationSUIDs=", ")", this.targetOccupationSUIDs);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/myjobs/data/model/InterviewPrepProctorPayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/myjobs/data/model/InterviewPrepProctorPayload;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<InterviewPrepProctorPayload> serializer() {
            return InterviewPrepProctorPayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public InterviewPrepProctorPayload() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public InterviewPrepProctorPayload(List<String> list) {
        list.getClass();
        this.targetOccupationSUIDs = list;
    }

    public /* synthetic */ InterviewPrepProctorPayload(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? zr4.a : list);
    }
}
