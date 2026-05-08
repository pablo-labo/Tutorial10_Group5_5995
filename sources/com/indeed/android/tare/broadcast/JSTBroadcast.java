package com.indeed.android.tare.broadcast;

import defpackage.j6g;
import defpackage.yd8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006JU\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f\"\b\b\u0000\u0010\u0007*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00042\n\u0010\u0012\u001a\u00060\u000ej\u0002`\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcast;", "", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "event", "Lj6g;", "dispatch", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;)V", "T", "Lyd8;", "eventType", "Lkotlin/Function1;", "", "eventMatcher", "callback", "", "Lcom/indeed/android/tare/broadcast/JSTBroadcastSubscriptionHandle;", "subscribe", "(Lyd8;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "handle", "unsubscribe", "(Ljava/lang/String;)V", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JSTBroadcast {
    void dispatch(JSTBroadcastEvent event);

    <T extends JSTBroadcastEvent> String subscribe(yd8<T> eventType, Function1<? super T, Boolean> eventMatcher, Function1<? super T, j6g> callback);

    void unsubscribe(String handle);
}
