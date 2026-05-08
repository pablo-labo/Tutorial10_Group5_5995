package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.errors.RiveEventException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.bg;
import defpackage.fh7;
import defpackage.ja;
import defpackage.nic;
import defpackage.oh7;
import defpackage.t92;
import defpackage.wl7;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b \u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b)\u0010*J \u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b/\u00100J \u00101\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0082 ¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b3\u00100J \u00104\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0082 ¢\u0006\u0004\b4\u00102J\u0018\u00105\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b5\u00100J \u00107\u001a\u0002062\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0082 ¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b;\u00100J(\u0010<\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b<\u0010=J(\u0010>\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b>\u0010=J(\u0010?\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b?\u0010=J \u0010A\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020%2\u0006\u0010E\u001a\u00020%H\u0002¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR.\u0010J\u001a\u0004\u0018\u00010\u000f2\b\u0010I\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010#\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001f0W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\"0W8F¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020%0W8F¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020(0W8F¢\u0006\u0006\u001a\u0004\b_\u0010YR\u0014\u0010b\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010SR\u0014\u0010d\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010S¨\u0006e"}, d2 = {"Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "pointer", "Lj6g;", "cppDelete", "(J)V", "Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "transfer", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "receiveViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "", "elapsed", "", "advance", "(F)Z", "x", "y", "pointerDown", "(FF)V", "pointerUp", "pointerMove", "", "index", "Lapp/rive/runtime/kotlin/core/SMIInput;", "input", "(I)Lapp/rive/runtime/kotlin/core/SMIInput;", "", "name", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/SMIInput;", "Lapp/rive/runtime/kotlin/core/LayerState;", "stateChanged", "(I)Lapp/rive/runtime/kotlin/core/LayerState;", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "eventAt", "(I)Lapp/rive/runtime/kotlin/core/RiveEvent;", "elapsedTime", "cppAdvance", "(JF)Z", "cppPointer", "cppInputCount", "(J)I", "cppSMIInputByIndex", "(JI)J", "cppStateChangedCount", "cppStateChangedByIndex", "cppReportedEventCount", "Lapp/rive/runtime/kotlin/core/RiveEventReport;", "cppReportedEventAt", "(JI)Lapp/rive/runtime/kotlin/core/RiveEventReport;", "cppName", "(J)Ljava/lang/String;", "cppLayerCount", "cppPointerDown", "(JFF)V", "cppPointerUp", "cppPointerMove", "viewModel", "cppSetViewModelInstance", "(JJ)V", "convertInput", "(Lapp/rive/runtime/kotlin/core/SMIInput;)Lapp/rive/runtime/kotlin/core/SMIInput;", "state", "convertLayerState", "(Lapp/rive/runtime/kotlin/core/LayerState;)Lapp/rive/runtime/kotlin/core/LayerState;", "Ljava/util/concurrent/locks/ReentrantLock;", "value", "viewModelInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "getViewModelInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "setViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "getName", "()Ljava/lang/String;", "getLayerCount", "()I", "layerCount", "getInputCount", "inputCount", "", "getInputs", "()Ljava/util/List;", "inputs", "getInputNames", "inputNames", "getStatesChanged", "statesChanged", "getEventsReported", "eventsReported", "getStateChangedCount", "stateChangedCount", "getReportedEventCount", "reportedEventCount", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class StateMachineInstance extends NativeObject implements PlayableInstance {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private ViewModelInstance viewModelInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachineInstance(long j, ReentrantLock reentrantLock) {
        super(j);
        reentrantLock.getClass();
        this.lock = reentrantLock;
    }

    private final SMIInput convertInput(SMIInput input) throws StateMachineInputException {
        if (input.isBoolean()) {
            return new SMIBoolean(input.getCppPointer());
        }
        if (input.isTrigger()) {
            return new SMITrigger(input.getCppPointer());
        }
        if (input.isNumber()) {
            return new SMINumber(input.getCppPointer());
        }
        throw new StateMachineInputException("Unknown State Machine Input Instance for " + input.getName() + JwtParser.SEPARATOR_CHAR);
    }

    private final LayerState convertLayerState(LayerState state) throws StateMachineInputException {
        if (state.isAnimationState()) {
            return new AnimationState(state.getCppPointer());
        }
        if (state.isAnyState()) {
            return new AnyState(state.getCppPointer());
        }
        if (state.isEntryState()) {
            return new EntryState(state.getCppPointer());
        }
        if (state.isExitState()) {
            return new ExitState(state.getCppPointer());
        }
        if (state.isBlendState()) {
            return new BlendState(state.getCppPointer());
        }
        throw new StateMachineInputException("Unknown Layer State for " + state + JwtParser.SEPARATOR_CHAR);
    }

    private final native boolean cppAdvance(long pointer, float elapsedTime);

    private final native int cppInputCount(long cppPointer);

    private final native int cppLayerCount(long cppPointer);

    private final native String cppName(long cppPointer);

    private final native void cppPointerDown(long cppPointer, float x, float y);

    private final native void cppPointerMove(long cppPointer, float x, float y);

    private final native void cppPointerUp(long cppPointer, float x, float y);

    private final native RiveEventReport cppReportedEventAt(long cppPointer, int index);

    private final native int cppReportedEventCount(long cppPointer);

    private final native long cppSMIInputByIndex(long cppPointer, int index);

    private final native void cppSetViewModelInstance(long cppPointer, long viewModel);

    private final native long cppStateChangedByIndex(long cppPointer, int index);

    private final native int cppStateChangedCount(long cppPointer);

    private final int getReportedEventCount() {
        return cppReportedEventCount(getCppPointer());
    }

    private final int getStateChangedCount() {
        return cppStateChangedCount(getCppPointer());
    }

    public final boolean advance(float elapsed) {
        boolean zCppAdvance;
        synchronized (this.lock) {
            zCppAdvance = cppAdvance(getCppPointer(), elapsed);
        }
        return zCppAdvance;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public final RiveEvent eventAt(int index) throws RiveEventException {
        RiveEventReport riveEventReportCppReportedEventAt = cppReportedEventAt(getCppPointer(), index);
        if (riveEventReportCppReportedEventAt.getUnsafeCppPointer() != 0) {
            return riveEventReportCppReportedEventAt.getEvent();
        }
        throw new RiveEventException(bg.c(JwtParser.SEPARATOR_CHAR, index, "No Rive Event found at index "));
    }

    public final List<RiveEvent> getEventsReported() {
        oh7 oh7VarH = nic.H(0, getReportedEventCount());
        ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
        Iterator<Integer> it = oh7VarH.iterator();
        while (it.hasNext()) {
            arrayList.add(eventAt(((fh7) it).nextInt()));
        }
        return arrayList;
    }

    public final int getInputCount() {
        return cppInputCount(getCppPointer());
    }

    public final List<String> getInputNames() {
        oh7 oh7VarH = nic.H(0, getInputCount());
        ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
        Iterator<Integer> it = oh7VarH.iterator();
        while (it.hasNext()) {
            arrayList.add(input(((fh7) it).nextInt()).getName());
        }
        return arrayList;
    }

    public final List<SMIInput> getInputs() {
        oh7 oh7VarH = nic.H(0, getInputCount());
        ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
        Iterator<Integer> it = oh7VarH.iterator();
        while (it.hasNext()) {
            arrayList.add(input(((fh7) it).nextInt()));
        }
        return arrayList;
    }

    public final int getLayerCount() {
        return cppLayerCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    public String getName() {
        return cppName(getCppPointer());
    }

    public final List<LayerState> getStatesChanged() {
        oh7 oh7VarH = nic.H(0, getStateChangedCount());
        ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
        Iterator<Integer> it = oh7VarH.iterator();
        while (it.hasNext()) {
            arrayList.add(stateChanged(((fh7) it).nextInt()));
        }
        return arrayList;
    }

    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public final SMIInput input(String name) {
        name.getClass();
        int inputCount = getInputCount();
        for (int i = 0; i < inputCount; i++) {
            SMIInput sMIInputInput = input(i);
            if (wl7.b(sMIInputInput.getName(), name)) {
                return sMIInputInput;
            }
        }
        throw new StateMachineInputException(ja.f(JwtParser.SEPARATOR_CHAR, "No StateMachineInput found with name ", name));
    }

    public final void pointerDown(float x, float y) {
        synchronized (this.lock) {
            cppPointerDown(getCppPointer(), x, y);
        }
    }

    public final void pointerMove(float x, float y) {
        synchronized (this.lock) {
            cppPointerMove(getCppPointer(), x, y);
        }
    }

    public final void pointerUp(float x, float y) {
        synchronized (this.lock) {
            cppPointerUp(getCppPointer(), x, y);
        }
    }

    public final ViewModelInstance receiveViewModelInstance(ViewModelInstance.Transfer transfer) {
        transfer.getClass();
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    public final void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
        }
        this.viewModelInstance = viewModelInstance;
    }

    public final LayerState stateChanged(int index) throws StateMachineInputException {
        long jCppStateChangedByIndex = cppStateChangedByIndex(getCppPointer(), index);
        if (jCppStateChangedByIndex != 0) {
            return convertLayerState(new LayerState(jCppStateChangedByIndex));
        }
        throw new StateMachineInputException(bg.c(JwtParser.SEPARATOR_CHAR, index, "No LayerState found at index "));
    }

    public final SMIInput input(int index) throws StateMachineInputException {
        long jCppSMIInputByIndex = cppSMIInputByIndex(getCppPointer(), index);
        if (jCppSMIInputByIndex != 0) {
            return convertInput(new SMIInput(jCppSMIInputByIndex));
        }
        throw new StateMachineInputException(bg.c(JwtParser.SEPARATOR_CHAR, index, "No StateMachineInput found at index "));
    }
}
