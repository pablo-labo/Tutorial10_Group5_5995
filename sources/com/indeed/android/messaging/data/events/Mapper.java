package com.indeed.android.messaging.data.events;

import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.gy2;
import defpackage.jw2;
import defpackage.o75;
import defpackage.qw2;
import defpackage.sw2;
import defpackage.t92;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/indeed/android/messaging/data/events/Mapper;", "", "<init>", "()V", "Lsw2;", "type", "Lcom/indeed/android/messaging/data/events/EventRecord$EventType;", "mapEventType", "(Lsw2;)Lcom/indeed/android/messaging/data/events/EventRecord$EventType;", "Lo75$e;", "event", "", "conversationId", "Lcom/indeed/android/messaging/data/events/EventRecord;", "mapToEventRecord", "(Lo75$e;Ljava/lang/String;)Lcom/indeed/android/messaging/data/events/EventRecord;", "Lqw2;", "eventSubType", "Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;", "mapEventSubType", "(Lqw2;)Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Mapper {
    public static final int $stable = 0;
    public static final Mapper INSTANCE = new Mapper();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[sw2.values().length];
            try {
                sw2.a aVar = sw2.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sw2.a aVar2 = sw2.a;
                iArr[8] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                sw2.a aVar3 = sw2.a;
                iArr[10] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                sw2.a aVar4 = sw2.a;
                iArr[9] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                sw2.a aVar5 = sw2.a;
                iArr[13] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                sw2.a aVar6 = sw2.a;
                iArr[15] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                sw2.a aVar7 = sw2.a;
                iArr[14] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                sw2.a aVar8 = sw2.a;
                iArr[12] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                sw2.a aVar9 = sw2.a;
                iArr[16] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                sw2.a aVar10 = sw2.a;
                iArr[5] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                sw2.a aVar11 = sw2.a;
                iArr[6] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                sw2.a aVar12 = sw2.a;
                iArr[7] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                sw2.a aVar13 = sw2.a;
                iArr[1] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                sw2.a aVar14 = sw2.a;
                iArr[2] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                sw2.a aVar15 = sw2.a;
                iArr[3] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                sw2.a aVar16 = sw2.a;
                iArr[4] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                sw2.a aVar17 = sw2.a;
                iArr[18] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                sw2.a aVar18 = sw2.a;
                iArr[19] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                sw2.a aVar19 = sw2.a;
                iArr[21] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[qw2.values().length];
            try {
                qw2.a aVar20 = qw2.a;
                iArr2[26] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private Mapper() {
    }

    private final EventRecord.EventType mapEventType(sw2 type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
        }
        return EventRecord.EventType.UNKNOWN;
    }

    public final EventRecord.EventSubType mapEventSubType(qw2 eventSubType) {
        if (eventSubType == null) {
            return EventRecord.EventSubType.UNKNOWN;
        }
        try {
            return EventRecord.EventSubType.valueOf(eventSubType.a());
        } catch (IllegalArgumentException unused) {
            return WhenMappings.$EnumSwitchMapping$1[eventSubType.ordinal()] == 1 ? EventRecord.EventSubType.UNKNOWN : EventRecord.EventSubType.UNKNOWN;
        }
    }

    public final EventRecord mapToEventRecord(o75.e event, String conversationId) {
        o75.h hVar;
        String str;
        String str2;
        event.getClass();
        conversationId.getClass();
        String str3 = event.a;
        o75.b bVar = event.b;
        gy2 gy2Var = bVar.b;
        if (gy2Var == null) {
            gy2Var = gy2.e;
        }
        gy2 gy2Var2 = gy2Var;
        String str4 = bVar.a;
        EventRecord.EventType eventTypeMapEventType = mapEventType(event.c);
        EventRecord.EventSubType eventSubTypeMapEventSubType = mapEventSubType(event.d);
        String str5 = event.e;
        if (str5 == null) {
            str5 = "";
        }
        boolean z = event.f == jw2.c;
        long time = event.h.getTime();
        ArrayList<o75.a> arrayList = event.i;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        for (o75.a aVar : arrayList) {
            arrayList2.add(new EventRecord.Attachment(aVar.a, aVar.b, aVar.c, null, null, null, 56, null));
        }
        o75.k kVar = event.j;
        EventRecord.TimelineModule timelineModule = null;
        if (kVar != null && (hVar = kVar.b) != null && (str = hVar.a) != null && (str2 = hVar.b) != null) {
            timelineModule = new EventRecord.TimelineModule(str.toString(), str2.toString());
        }
        return new EventRecord(str3, eventTypeMapEventType, eventSubTypeMapEventSubType, str5, z, time, false, gy2Var2, str4, conversationId, null, arrayList2, timelineModule, 1088, null);
    }
}
