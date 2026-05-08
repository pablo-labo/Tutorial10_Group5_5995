package com.indeed.android.myjobs.data.model.dto;

import defpackage.g7;
import defpackage.wl7;
import defpackage.zr4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/EmployerInvitationDto;", "", "invitedJobs", "", "Lcom/indeed/android/myjobs/data/model/dto/InvitedJobDto;", "<init>", "(Ljava/util/List;)V", "getInvitedJobs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmployerInvitationDto {
    private final List<InvitedJobDto> invitedJobs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public EmployerInvitationDto(List<InvitedJobDto> list) {
        list.getClass();
        this.invitedJobs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmployerInvitationDto copy$default(EmployerInvitationDto employerInvitationDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = employerInvitationDto.invitedJobs;
        }
        return employerInvitationDto.copy(list);
    }

    public final List<InvitedJobDto> component1() {
        return this.invitedJobs;
    }

    public final EmployerInvitationDto copy(List<InvitedJobDto> invitedJobs) {
        invitedJobs.getClass();
        return new EmployerInvitationDto(invitedJobs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EmployerInvitationDto) && wl7.b(this.invitedJobs, ((EmployerInvitationDto) other).invitedJobs);
    }

    public final List<InvitedJobDto> getInvitedJobs() {
        return this.invitedJobs;
    }

    public int hashCode() {
        return this.invitedJobs.hashCode();
    }

    public String toString() {
        return g7.h("EmployerInvitationDto(invitedJobs=", ")", this.invitedJobs);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/EmployerInvitationDto$Companion;", "", "<init>", "()V", "init", "Lcom/indeed/android/myjobs/data/model/dto/EmployerInvitationDto;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EmployerInvitationDto init() {
            return new EmployerInvitationDto(zr4.a);
        }

        private Companion() {
        }
    }
}
