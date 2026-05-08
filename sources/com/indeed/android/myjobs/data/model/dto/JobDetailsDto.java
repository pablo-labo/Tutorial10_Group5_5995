package com.indeed.android.myjobs.data.model.dto;

import defpackage.akb;
import defpackage.ia;
import defpackage.u40;
import defpackage.wl7;
import defpackage.z92;
import defpackage.zve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0015\u001a\u00020\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/JobDetailsDto;", "", "key", "", "displayTitle", "compensation", "location", "employerName", "jobTypes", "", "Lcom/indeed/android/myjobs/data/model/dto/JobTypeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getKey", "()Ljava/lang/String;", "getDisplayTitle", "getCompensation", "getLocation", "getEmployerName", "getJobTypes", "()Ljava/util/List;", "getJobTypesString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JobDetailsDto {
    private final String compensation;
    private final String displayTitle;
    private final String employerName;
    private final List<JobTypeDto> jobTypes;
    private final String key;
    private final String location;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public JobDetailsDto(String str, String str2, String str3, String str4, String str5, List<JobTypeDto> list) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.displayTitle = str2;
        this.compensation = str3;
        this.location = str4;
        this.employerName = str5;
        this.jobTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JobDetailsDto copy$default(JobDetailsDto jobDetailsDto, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jobDetailsDto.key;
        }
        if ((i & 2) != 0) {
            str2 = jobDetailsDto.displayTitle;
        }
        if ((i & 4) != 0) {
            str3 = jobDetailsDto.compensation;
        }
        if ((i & 8) != 0) {
            str4 = jobDetailsDto.location;
        }
        if ((i & 16) != 0) {
            str5 = jobDetailsDto.employerName;
        }
        if ((i & 32) != 0) {
            list = jobDetailsDto.jobTypes;
        }
        String str6 = str5;
        List list2 = list;
        return jobDetailsDto.copy(str, str2, str3, str4, str6, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCompensation() {
        return this.compensation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmployerName() {
        return this.employerName;
    }

    public final List<JobTypeDto> component6() {
        return this.jobTypes;
    }

    public final JobDetailsDto copy(String key, String displayTitle, String compensation, String location, String employerName, List<JobTypeDto> jobTypes) {
        key.getClass();
        displayTitle.getClass();
        return new JobDetailsDto(key, displayTitle, compensation, location, employerName, jobTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JobDetailsDto)) {
            return false;
        }
        JobDetailsDto jobDetailsDto = (JobDetailsDto) other;
        return wl7.b(this.key, jobDetailsDto.key) && wl7.b(this.displayTitle, jobDetailsDto.displayTitle) && wl7.b(this.compensation, jobDetailsDto.compensation) && wl7.b(this.location, jobDetailsDto.location) && wl7.b(this.employerName, jobDetailsDto.employerName) && wl7.b(this.jobTypes, jobDetailsDto.jobTypes);
    }

    public final String getCompensation() {
        return this.compensation;
    }

    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    public final String getEmployerName() {
        return this.employerName;
    }

    public final List<JobTypeDto> getJobTypes() {
        return this.jobTypes;
    }

    public final String getJobTypesString() {
        List<JobTypeDto> list = this.jobTypes;
        if (list == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String label = ((JobTypeDto) it.next()).getLabel();
            if (zve.U(label)) {
                label = null;
            }
            if (label != null) {
                arrayList.add(label);
            }
        }
        return z92.W0(arrayList, " • ", null, null, null, 62);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLocation() {
        return this.location;
    }

    public int hashCode() {
        int iD = akb.d(this.key.hashCode() * 31, 31, this.displayTitle);
        String str = this.compensation;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.location;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.employerName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<JobTypeDto> list = this.jobTypes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.displayTitle;
        String str3 = this.compensation;
        String str4 = this.location;
        String str5 = this.employerName;
        List<JobTypeDto> list = this.jobTypes;
        StringBuilder sbF = u40.f("JobDetailsDto(key=", str, ", displayTitle=", str2, ", compensation=");
        ia.r(sbF, str3, ", location=", str4, ", employerName=");
        sbF.append(str5);
        sbF.append(", jobTypes=");
        sbF.append(list);
        sbF.append(")");
        return sbF.toString();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/myjobs/data/model/dto/JobDetailsDto$Companion;", "", "<init>", "()V", "init", "Lcom/indeed/android/myjobs/data/model/dto/JobDetailsDto;", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JobDetailsDto init() {
            return new JobDetailsDto("", "", null, null, null, null);
        }

        private Companion() {
        }
    }
}
