package com.indeed.android.messaging.data.conversations;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl;
import defpackage.ak2;
import defpackage.g13;
import defpackage.gy2;
import defpackage.h4a;
import defpackage.hh2;
import defpackage.is4;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.pu2;
import defpackage.q2;
import defpackage.t92;
import defpackage.uh3;
import defpackage.wl7;
import defpackage.z92;
import defpackage.zve;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u0012J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\rH\u0096@¢\u0006\u0004\b\u001e\u0010\u0010J0\u0010\"\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0096@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nH\u0096@¢\u0006\u0004\b$\u0010\u0012J!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b&\u0010'J)\u0010-\u001a\u00020\n2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00100R\u0014\u00101\u001a\u00020+8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u00104R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/OnlineStatusRepositoryImpl;", "Lcom/indeed/android/messaging/data/conversations/OnlineStatusRepository;", "Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;", "dataSource", "<init>", "(Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;)V", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "participant", "", "newStatus", "Lj6g;", "updateSingleAccount", "(Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "", "input", "registerOnlineStatusTargets", "(Ljava/util/List;Llu2;)Ljava/lang/Object;", "emitOnlineEmployerIds", "(Llu2;)Ljava/lang/Object;", "Lh4a;", "", "observeOnlineEmployerIds", "()Lh4a;", "", "checkJSOnlineStatusPreference", "enabled", "updateJSOnlineStatusPreference", "(ZLlu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "conversations", "registerTargetsForConversations", "advertiserKey", "accountKey", "accountType", "updateEmployerOnlineStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "refreshRegistration", "participants", "getValidEmployerParticipants", "(Ljava/util/List;)Ljava/util/List;", "", "Lcom/indeed/android/messaging/data/conversations/EmployerAccountOnlineStatusRecord;", "employerOnlineStatus", "", "maxSize", "keepRecentlyQueriedEmployerAccounts", "(Ljava/util/Map;I)V", "Lcom/indeed/android/messaging/data/conversations/ConversationsRemoteDataSource;", "Ljava/util/Map;", "trackedAccountsLimit", "I", "onlineStatusString", "Ljava/lang/String;", "employerTypeString", "onlineEmployerIds", "Lh4a;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnlineStatusRepositoryImpl implements OnlineStatusRepository {
    public static final int $stable = 8;
    private final ConversationsRemoteDataSource dataSource;
    private final Map<String, EmployerAccountOnlineStatusRecord> employerOnlineStatus;
    private final String employerTypeString;
    private final h4a<Set<String>> onlineEmployerIds;
    private final String onlineStatusString;
    private final int trackedAccountsLimit;

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl$registerOnlineStatusTargets$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl", f = "OnlineStatusRepository.kt", l = {125, 142}, m = "registerOnlineStatusTargets")
    public static final class AnonymousClass1 extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lu2<? super AnonymousClass1> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnlineStatusRepositoryImpl.this.registerOnlineStatusTargets(null, this);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl$updateEmployerOnlineStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl", f = "OnlineStatusRepository.kt", l = {84, 89, 94}, m = "updateEmployerOnlineStatus")
    public static final class C06551 extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C06551(lu2<? super C06551> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnlineStatusRepositoryImpl.this.updateEmployerOnlineStatus(null, null, null, null, this);
        }
    }

    public OnlineStatusRepositoryImpl(ConversationsRemoteDataSource conversationsRemoteDataSource) {
        conversationsRemoteDataSource.getClass();
        this.dataSource = conversationsRemoteDataSource;
        this.employerOnlineStatus = new LinkedHashMap();
        this.trackedAccountsLimit = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.onlineStatusString = "ONLINE";
        this.employerTypeString = "EMPLOYER";
        this.onlineEmployerIds = hh2.e(is4.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitOnlineEmployerIds(lu2<? super j6g> lu2Var) {
        h4a<Set<String>> h4aVar = this.onlineEmployerIds;
        Set<Map.Entry<String, EmployerAccountOnlineStatusRecord>> setEntrySet = this.employerOnlineStatus.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((EmployerAccountOnlineStatusRecord) ((Map.Entry) obj).getValue()).isOnline()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Map.Entry) it.next()).getKey());
        }
        Object objA = h4aVar.a(z92.E1(arrayList2), lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean keepRecentlyQueriedEmployerAccounts$lambda$11(Set set, Map.Entry entry) {
        entry.getClass();
        return !set.contains(entry.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean keepRecentlyQueriedEmployerAccounts$lambda$12(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c0, code lost:
    
        if (emitOnlineEmployerIds(r0) == r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object registerOnlineStatusTargets(java.util.List<com.indeed.android.messaging.data.conversations.ConversationRecord.Participant> r14, defpackage.lu2<? super defpackage.j6g> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r15
            com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl$registerOnlineStatusTargets$1 r0 = (com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl$registerOnlineStatusTargets$1 r0 = new com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl$registerOnlineStatusTargets$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            java.lang.Object r13 = r0.L$0
            java.util.List r13 = (java.util.List) r13
            defpackage.r7d.b(r15)
            goto Lc3
        L30:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r13)
            return r2
        L36:
            java.lang.Object r14 = r0.L$0
            java.util.List r14 = (java.util.List) r14
            defpackage.r7d.b(r15)     // Catch: java.lang.Exception -> Lb8
            goto L59
        L3e:
            defpackage.r7d.b(r15)
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L4a
            j6g r13 = defpackage.j6g.a
            return r13
        L4a:
            com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource r15 = r13.dataSource     // Catch: java.lang.Exception -> Lb8
            r0.L$0 = r14     // Catch: java.lang.Exception -> Lb8
            r0.label = r4     // Catch: java.lang.Exception -> Lb8
            r1 = 300(0x12c, float:4.2E-43)
            java.lang.Object r15 = r15.registerOnlineStatusListeners(r14, r1, r0)     // Catch: java.lang.Exception -> Lb8
            if (r15 != r5) goto L59
            goto Lc2
        L59:
            dyc$g r15 = (dyc.g) r15     // Catch: java.lang.Exception -> Lb8
            dyc$h r1 = r15.a     // Catch: java.lang.Exception -> Lb8
            if (r1 == 0) goto Lb8
            java.util.ArrayList r1 = r1.a     // Catch: java.lang.Exception -> Lb8
            int r4 = r14.size()     // Catch: java.lang.Exception -> Lb8
            int r1 = r1.size()     // Catch: java.lang.Exception -> Lb8
            if (r4 != r1) goto Lb8
            r1 = r14
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Exception -> Lb8
            int r1 = r1.size()     // Catch: java.lang.Exception -> Lb8
            r4 = 0
        L73:
            if (r4 >= r1) goto Lb8
            java.lang.Object r6 = r14.get(r4)     // Catch: java.lang.Exception -> Lb8
            com.indeed.android.messaging.data.conversations.ConversationRecord$Participant r6 = (com.indeed.android.messaging.data.conversations.ConversationRecord.Participant) r6     // Catch: java.lang.Exception -> Lb8
            java.lang.String r6 = r6.getOnlineStatusId()     // Catch: java.lang.Exception -> Lb8
            if (r6 == 0) goto Lb5
            dyc$h r7 = r15.a     // Catch: java.lang.Exception -> Lb8
            if (r7 == 0) goto L9a
            java.util.ArrayList r7 = r7.a     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Exception -> Lb8
            dyc$a r7 = (dyc.a) r7     // Catch: java.lang.Exception -> Lb8
            if (r7 == 0) goto L9a
            dyc$c r7 = r7.b     // Catch: java.lang.Exception -> Lb8
            if (r7 == 0) goto L9a
            dyc$e r7 = r7.a     // Catch: java.lang.Exception -> Lb8
            if (r7 == 0) goto L9a
            java.lang.String r7 = r7.b     // Catch: java.lang.Exception -> Lb8
            goto L9b
        L9a:
            r7 = r2
        L9b:
            java.util.Map<java.lang.String, com.indeed.android.messaging.data.conversations.EmployerAccountOnlineStatusRecord> r8 = r13.employerOnlineStatus     // Catch: java.lang.Exception -> Lb8
            com.indeed.android.messaging.data.conversations.EmployerAccountOnlineStatusRecord r9 = new com.indeed.android.messaging.data.conversations.EmployerAccountOnlineStatusRecord     // Catch: java.lang.Exception -> Lb8
            java.lang.String r10 = r13.onlineStatusString     // Catch: java.lang.Exception -> Lb8
            boolean r7 = defpackage.wl7.b(r10, r7)     // Catch: java.lang.Exception -> Lb8
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r12 = r14.get(r4)     // Catch: java.lang.Exception -> Lb8
            com.indeed.android.messaging.data.conversations.ConversationRecord$Participant r12 = (com.indeed.android.messaging.data.conversations.ConversationRecord.Participant) r12     // Catch: java.lang.Exception -> Lb8
            r9.<init>(r7, r10, r12)     // Catch: java.lang.Exception -> Lb8
            r8.put(r6, r9)     // Catch: java.lang.Exception -> Lb8
        Lb5:
            int r4 = r4 + 1
            goto L73
        Lb8:
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r13 = r13.emitOnlineEmployerIds(r0)
            if (r13 != r5) goto Lc3
        Lc2:
            return r5
        Lc3:
            j6g r13 = defpackage.j6g.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl.registerOnlineStatusTargets(java.util.List, lu2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSingleAccount(ConversationRecord.Participant participant, String str, lu2<? super j6g> lu2Var) {
        ConversationRecord.Participant participant2;
        String onlineStatusId = participant.getOnlineStatusId();
        if (onlineStatusId != null) {
            Map<String, EmployerAccountOnlineStatusRecord> map = this.employerOnlineStatus;
            boolean zB = wl7.b(this.onlineStatusString, str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            EmployerAccountOnlineStatusRecord employerAccountOnlineStatusRecord = this.employerOnlineStatus.get(onlineStatusId);
            if (employerAccountOnlineStatusRecord != null && (participant2 = employerAccountOnlineStatusRecord.getParticipant()) != null) {
                participant = participant2;
            }
            map.put(onlineStatusId, new EmployerAccountOnlineStatusRecord(zB, jCurrentTimeMillis, participant));
            Object objEmitOnlineEmployerIds = emitOnlineEmployerIds(lu2Var);
            if (objEmitOnlineEmployerIds == g13.a) {
                return objEmitOnlineEmployerIds;
            }
        }
        return j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.OnlineStatusRepository
    public Object checkJSOnlineStatusPreference(lu2<? super Boolean> lu2Var) {
        return this.dataSource.getJSOnlineStatus(lu2Var);
    }

    public final List<ConversationRecord.Participant> getValidEmployerParticipants(List<ConversationRecord.Participant> participants) {
        participants.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : participants) {
            if (!((ConversationRecord.Participant) obj).getRemoved()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ConversationRecord.Participant) obj2).getRole() == gy2.d) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            String onlineStatusId = ((ConversationRecord.Participant) obj3).getOnlineStatusId();
            if (!(onlineStatusId == null || zve.U(onlineStatusId))) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public final void keepRecentlyQueriedEmployerAccounts(Map<String, EmployerAccountOnlineStatusRecord> employerOnlineStatus, int maxSize) {
        employerOnlineStatus.getClass();
        List listP1 = z92.p1(z92.z1(employerOnlineStatus.entrySet()), new Comparator() { // from class: com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl$keepRecentlyQueriedEmployerAccounts$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ak2.i(Long.valueOf(((EmployerAccountOnlineStatusRecord) ((Map.Entry) t2).getValue()).getTimeStampUpdateInMills()), Long.valueOf(((EmployerAccountOnlineStatusRecord) ((Map.Entry) t).getValue()).getTimeStampUpdateInMills()));
            }
        });
        int size = employerOnlineStatus.size();
        if (maxSize > size) {
            maxSize = size;
        }
        List listSubList = listP1.subList(0, maxSize);
        ArrayList arrayList = new ArrayList(t92.r0(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        Set setE1 = z92.E1(arrayList);
        Set<Map.Entry<String, EmployerAccountOnlineStatusRecord>> setEntrySet = employerOnlineStatus.entrySet();
        final q2 q2Var = new q2(setE1, 17);
        setEntrySet.removeIf(new Predicate() { // from class: hta
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return OnlineStatusRepositoryImpl.keepRecentlyQueriedEmployerAccounts$lambda$12(q2Var, obj);
            }
        });
    }

    @Override // com.indeed.android.messaging.data.conversations.OnlineStatusRepository
    public Object refreshRegistration(lu2<? super j6g> lu2Var) {
        keepRecentlyQueriedEmployerAccounts(this.employerOnlineStatus, this.trackedAccountsLimit);
        Set<Map.Entry<String, EmployerAccountOnlineStatusRecord>> setEntrySet = this.employerOnlineStatus.entrySet();
        ArrayList arrayList = new ArrayList(t92.r0(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((EmployerAccountOnlineStatusRecord) ((Map.Entry) it.next()).getValue()).getParticipant());
        }
        Object objRegisterOnlineStatusTargets = registerOnlineStatusTargets(arrayList, lu2Var);
        return objRegisterOnlineStatusTargets == g13.a ? objRegisterOnlineStatusTargets : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.OnlineStatusRepository
    public Object registerTargetsForConversations(List<ConversationRecord> list, lu2<? super j6g> lu2Var) {
        ArrayList<ConversationRecord.Participant> arrayList = new ArrayList();
        Iterator it = z92.p1(list, new Comparator() { // from class: com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl$registerTargetsForConversations$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ak2.i(Long.valueOf(((ConversationRecord) t2).getLastEventTimestamp()), Long.valueOf(((ConversationRecord) t).getLastEventTimestamp()));
            }
        }).iterator();
        while (it.hasNext()) {
            arrayList.addAll(getValidEmployerParticipants(((ConversationRecord) it.next()).getParticipants()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (ConversationRecord.Participant participant : arrayList) {
            if (this.employerOnlineStatus.containsKey(participant.getOnlineStatusId())) {
                EmployerAccountOnlineStatusRecord employerAccountOnlineStatusRecord = this.employerOnlineStatus.get(participant.getOnlineStatusId());
                if (employerAccountOnlineStatusRecord != null) {
                    employerAccountOnlineStatusRecord.setTimeStampUpdateInMills(System.currentTimeMillis());
                }
            } else {
                arrayList2.add(participant);
            }
        }
        int i = this.trackedAccountsLimit;
        int size = arrayList2.size();
        if (i > size) {
            i = size;
        }
        List<ConversationRecord.Participant> listSubList = arrayList2.subList(0, i);
        listSubList.getClass();
        Object objRegisterOnlineStatusTargets = registerOnlineStatusTargets(listSubList, lu2Var);
        return objRegisterOnlineStatusTargets == g13.a ? objRegisterOnlineStatusTargets : j6g.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        if (updateSingleAccount(r9, r1, r2) == r8) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011f, code lost:
    
        if (updateSingleAccount(r9, r3, r2) == r8) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.indeed.android.messaging.data.conversations.OnlineStatusRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object updateEmployerOnlineStatus(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.lu2<? super defpackage.j6g> r25) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.OnlineStatusRepositoryImpl.updateEmployerOnlineStatus(java.lang.String, java.lang.String, java.lang.String, java.lang.String, lu2):java.lang.Object");
    }

    @Override // com.indeed.android.messaging.data.conversations.OnlineStatusRepository
    public Object updateJSOnlineStatusPreference(boolean z, lu2<? super Boolean> lu2Var) {
        return this.dataSource.setJSOnlineStatus(z, lu2Var);
    }

    @Override // com.indeed.android.messaging.data.conversations.OnlineStatusRepository
    public h4a<Set<String>> observeOnlineEmployerIds() {
        return this.onlineEmployerIds;
    }
}
