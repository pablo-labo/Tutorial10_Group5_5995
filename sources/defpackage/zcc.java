package defpackage;

import com.facebook.react.module.model.ReactModuleInfo;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zcc implements omc {
    @Override // defpackage.omc
    public final Map a() {
        Annotation annotation = RNGestureHandlerModule.class.getAnnotation(nmc.class);
        annotation.getClass();
        nmc nmcVar = (nmc) annotation;
        return lc9.b0(new Pair("RNGestureHandlerModule", new ReactModuleInfo(nmcVar.name(), RNGestureHandlerModule.class.getName(), nmcVar.canOverrideExistingModule(), nmcVar.needsEagerInit(), nmcVar.isCxxModule(), true)));
    }
}
