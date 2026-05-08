package app.rive.runtime.kotlin.core;

import android.graphics.RectF;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.errors.AnimationException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.akb;
import defpackage.b0;
import defpackage.bg;
import defpackage.fh7;
import defpackage.j6g;
import defpackage.ja;
import defpackage.l5;
import defpackage.nic;
import defpackage.oh7;
import defpackage.t40;
import defpackage.t92;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096 ¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010$J!\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010%J'\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0002H\u0017¢\u0006\u0004\b2\u0010\u000bJ1\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020,H\u0017¢\u0006\u0004\b2\u00108J\u000f\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\b<\u0010=J \u0010>\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0092 ¢\u0006\u0004\b>\u0010?J \u0010@\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bB\u0010CJ \u0010D\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0092 ¢\u0006\u0004\bD\u0010EJ \u0010F\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0092 ¢\u0006\u0004\bF\u0010?J \u0010G\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\bG\u0010AJ\u0018\u0010H\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bH\u0010CJ \u0010I\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0092 ¢\u0006\u0004\bI\u0010EJ(\u0010J\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\bJ\u0010KJ\u0018\u0010L\u001a\u00020,2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bL\u0010MJ \u0010O\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010N\u001a\u00020,H\u0092 ¢\u0006\u0004\bO\u0010PJ \u0010Q\u001a\u00020.2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0092 ¢\u0006\u0004\bQ\u0010RJ \u0010S\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\bS\u0010AJ\"\u0010T\u001a\u0004\u0018\u00010\u00112\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\bT\u0010UJ(\u0010W\u001a\u00020.2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\bW\u0010XJ(\u0010Y\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\bY\u0010KJ*\u0010Z\u001a\u0004\u0018\u00010\u00112\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\bZ\u0010[J0\u0010\\\u001a\u00020.2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0092 ¢\u0006\u0004\b\\\u0010]J \u0010_\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\b_\u0010`J8\u0010a\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010^\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020,H\u0092 ¢\u0006\u0004\ba\u0010bJ\u0018\u0010d\u001a\u00020c2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bd\u0010eJ\u0018\u0010f\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bf\u0010\u000bJ\u0018\u0010g\u001a\u00020,2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bg\u0010MJ \u0010i\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010h\u001a\u00020,H\u0092 ¢\u0006\u0004\bi\u0010PJ\u0018\u0010j\u001a\u00020,2\u0006\u0010;\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bj\u0010MJ \u0010l\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010k\u001a\u00020,H\u0092 ¢\u0006\u0004\bl\u0010PJ \u0010n\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bn\u0010`J\u0017\u0010o\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0012¢\u0006\u0004\bo\u0010pR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010qR.\u0010s\u001a\u0004\u0018\u00010)2\b\u0010r\u001a\u0004\u0018\u00010)8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR(\u0010N\u001a\u00020,2\u0006\u0010r\u001a\u00020,8V@PX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0017\u0010\u008c\u0001\u001a\u00020c8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R(\u0010h\u001a\u00020,2\u0006\u0010r\u001a\u00020,8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u008d\u0001\u0010\u0082\u0001\"\u0006\b\u008e\u0001\u0010\u0084\u0001R(\u0010k\u001a\u00020,2\u0006\u0010r\u001a\u00020,8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0082\u0001\"\u0006\b\u0090\u0001\u0010\u0084\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0091\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0091\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0093\u0001¨\u0006\u0097\u0001"}, d2 = {"Lapp/rive/runtime/kotlin/core/Artboard;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "pointer", "Lj6g;", "cppDelete", "(J)V", "", "index", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "animation", "(I)Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "", "name", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "stateMachine", "(I)Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "path", "Lapp/rive/runtime/kotlin/core/SMIInput;", "input", "(Ljava/lang/String;Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/SMIInput;", "Lapp/rive/runtime/kotlin/core/RiveTextValueRun;", "textRun", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/RiveTextValueRun;", "getTextRunValue", "(Ljava/lang/String;)Ljava/lang/String;", "textValue", "setTextRunValue", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/RiveTextValueRun;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "transfer", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "receiveViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "", "elapsedTime", "", "advance", "(F)Z", "rendererAddress", "draw", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "scaleFactor", "(JLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;F)V", "resetArtboardSize", "()V", "cppPointer", "cppName", "(J)Ljava/lang/String;", "cppAnimationByIndex", "(JI)J", "cppAnimationByName", "(JLjava/lang/String;)J", "cppAnimationCount", "(J)I", "cppAnimationNameByIndex", "(JI)Ljava/lang/String;", "cppStateMachineByIndex", "cppStateMachineByName", "cppStateMachineCount", "cppStateMachineNameByIndex", "cppInputByNameAtPath", "(JLjava/lang/String;Ljava/lang/String;)J", "cppGetVolume", "(J)F", "volume", "cppSetVolume", "(JF)V", "cppAdvance", "(JF)Z", "cppFindTextValueRun", "cppFindValueOfTextValueRun", "(JLjava/lang/String;)Ljava/lang/String;", "newText", "cppSetValueOfTextValueRun", "(JLjava/lang/String;Ljava/lang/String;)Z", "cppFindTextValueRunAtPath", "cppFindValueOfTextValueRunAtPath", "(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "cppSetValueOfTextValueRunAtPath", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "rendererPointer", "cppDraw", "(JJ)V", "cppDrawAligned", "(JJLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;F)V", "Landroid/graphics/RectF;", "cppBounds", "(J)Landroid/graphics/RectF;", "cppResetArtboardSize", "cppGetArtboardWidth", "width", "cppSetArtboardWidth", "cppGetArtboardHeight", "height", "cppSetArtboardHeight", "instancePointer", "cppSetViewModelInstance", "convertInput", "(Lapp/rive/runtime/kotlin/core/SMIInput;)Lapp/rive/runtime/kotlin/core/SMIInput;", "Ljava/util/concurrent/locks/ReentrantLock;", "value", "viewModelInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "getViewModelInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "setViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "getName", "()Ljava/lang/String;", "getFirstAnimation", "()Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "firstAnimation", "getFirstStateMachine", "()Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "firstStateMachine", "getVolume", "()F", "setVolume$kotlin_release", "(F)V", "getAnimationCount", "()I", "animationCount", "getStateMachineCount", "stateMachineCount", "getBounds", "()Landroid/graphics/RectF;", "bounds", "getWidth", "setWidth", "getHeight", "setHeight", "", "getAnimationNames", "()Ljava/util/List;", "animationNames", "getStateMachineNames", "stateMachineNames", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public class Artboard extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock lock;
    private ViewModelInstance viewModelInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard(long j, ReentrantLock reentrantLock) {
        super(j);
        reentrantLock.getClass();
        this.lock = reentrantLock;
    }

    private SMIInput convertInput(SMIInput input) throws StateMachineInputException {
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

    private native boolean cppAdvance(long cppPointer, float elapsedTime);

    private native long cppAnimationByIndex(long cppPointer, int index);

    private native long cppAnimationByName(long cppPointer, String name);

    private native int cppAnimationCount(long cppPointer);

    private native String cppAnimationNameByIndex(long cppPointer, int index);

    private native RectF cppBounds(long cppPointer);

    private native void cppDraw(long cppPointer, long rendererPointer);

    private native void cppDrawAligned(long cppPointer, long rendererPointer, Fit fit, Alignment alignment, float scaleFactor);

    private native long cppFindTextValueRun(long cppPointer, String name);

    private native long cppFindTextValueRunAtPath(long cppPointer, String name, String path);

    private native String cppFindValueOfTextValueRun(long cppPointer, String name);

    private native String cppFindValueOfTextValueRunAtPath(long cppPointer, String name, String path);

    private native float cppGetArtboardHeight(long cppPointer);

    private native float cppGetArtboardWidth(long cppPointer);

    private native float cppGetVolume(long cppPointer);

    private native long cppInputByNameAtPath(long cppPointer, String name, String path);

    private native String cppName(long cppPointer);

    private native void cppResetArtboardSize(long cppPointer);

    private native void cppSetArtboardHeight(long cppPointer, float height);

    private native void cppSetArtboardWidth(long cppPointer, float width);

    private native boolean cppSetValueOfTextValueRun(long cppPointer, String name, String newText);

    private native boolean cppSetValueOfTextValueRunAtPath(long cppPointer, String name, String newText, String path);

    private native void cppSetViewModelInstance(long cppPointer, long instancePointer);

    private native void cppSetVolume(long cppPointer, float volume);

    private native long cppStateMachineByIndex(long cppPointer, int index);

    private native long cppStateMachineByName(long cppPointer, String name);

    private native int cppStateMachineCount(long cppPointer);

    private native String cppStateMachineNameByIndex(long cppPointer, int index);

    public static /* synthetic */ void draw$default(Artboard artboard, long j, Fit fit, Alignment alignment, float f, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: draw");
            return;
        }
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        artboard.draw(j, fit, alignment, f);
    }

    public boolean advance(float elapsedTime) {
        boolean zCppAdvance;
        synchronized (this.lock) {
            zCppAdvance = cppAdvance(getCppPointer(), elapsedTime);
        }
        return zCppAdvance;
    }

    public LinearAnimationInstance animation(String name) throws AnimationException {
        name.getClass();
        long jCppAnimationByName = cppAnimationByName(getCppPointer(), name);
        if (jCppAnimationByName != 0) {
            LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByName, this.lock, 0.0f, 4, null);
            getDependencies().add(linearAnimationInstance);
            return linearAnimationInstance;
        }
        StringBuilder sbM = akb.m("Animation \"", name, "\" not found. Available Animations: ");
        List<String> animationNames = getAnimationNames();
        ArrayList arrayList = new ArrayList(t92.r0(animationNames, 10));
        Iterator<T> it = animationNames.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + '\"');
        }
        sbM.append(arrayList);
        sbM.append('\"');
        throw new AnimationException(sbM.toString());
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public void draw(long rendererAddress, Fit fit, Alignment alignment, float scaleFactor) {
        fit.getClass();
        alignment.getClass();
        synchronized (this.lock) {
            cppDrawAligned(getCppPointer(), rendererAddress, fit, alignment, scaleFactor);
            j6g j6gVar = j6g.a;
        }
    }

    public int getAnimationCount() {
        return cppAnimationCount(getCppPointer());
    }

    public List<String> getAnimationNames() {
        oh7 oh7VarH = nic.H(0, getAnimationCount());
        ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
        Iterator<Integer> it = oh7VarH.iterator();
        while (it.hasNext()) {
            arrayList.add(cppAnimationNameByIndex(getCppPointer(), ((fh7) it).nextInt()));
        }
        return arrayList;
    }

    public RectF getBounds() {
        return cppBounds(getCppPointer());
    }

    public LinearAnimationInstance getFirstAnimation() {
        return animation(0);
    }

    public StateMachineInstance getFirstStateMachine() {
        return stateMachine(0);
    }

    public float getHeight() {
        return cppGetArtboardHeight(getCppPointer());
    }

    public String getName() {
        return cppName(getCppPointer());
    }

    public int getStateMachineCount() {
        return cppStateMachineCount(getCppPointer());
    }

    public List<String> getStateMachineNames() {
        oh7 oh7VarH = nic.H(0, getStateMachineCount());
        ArrayList arrayList = new ArrayList(t92.r0(oh7VarH, 10));
        Iterator<Integer> it = oh7VarH.iterator();
        while (it.hasNext()) {
            arrayList.add(cppStateMachineNameByIndex(getCppPointer(), ((fh7) it).nextInt()));
        }
        return arrayList;
    }

    public String getTextRunValue(String name, String path) {
        name.getClass();
        path.getClass();
        return cppFindValueOfTextValueRunAtPath(getCppPointer(), name, path);
    }

    public ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public float getVolume() {
        return cppGetVolume(getCppPointer());
    }

    public float getWidth() {
        return cppGetArtboardWidth(getCppPointer());
    }

    public SMIInput input(String name, String path) throws StateMachineInputException {
        name.getClass();
        path.getClass();
        long jCppInputByNameAtPath = cppInputByNameAtPath(getCppPointer(), name, path);
        if (jCppInputByNameAtPath != 0) {
            return convertInput(new SMIInput(jCppInputByNameAtPath));
        }
        throw new StateMachineInputException("No StateMachineInput found with name \"" + name + "\" in nested artboard " + path + JwtParser.SEPARATOR_CHAR);
    }

    public ViewModelInstance receiveViewModelInstance(ViewModelInstance.Transfer transfer) {
        transfer.getClass();
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    public void resetArtboardSize() {
        cppResetArtboardSize(getCppPointer());
    }

    public void setHeight(float f) {
        cppSetArtboardHeight(getCppPointer(), f);
    }

    public void setTextRunValue(String name, String textValue, String path) throws TextValueRunException {
        name.getClass();
        textValue.getClass();
        path.getClass();
        if (!cppSetValueOfTextValueRunAtPath(getCppPointer(), name, textValue, path)) {
            throw new TextValueRunException(akb.k("Could not set text run value at path. No Rive TextValueRun found with name \"", name, ".\" in nested artboard \"", path, ".\""));
        }
    }

    public void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
            this.viewModelInstance = viewModelInstance;
        }
    }

    public void setVolume$kotlin_release(float f) {
        cppSetVolume(getCppPointer(), f);
    }

    public void setWidth(float f) {
        cppSetArtboardWidth(getCppPointer(), f);
    }

    public StateMachineInstance stateMachine(String name) throws StateMachineException {
        name.getClass();
        long jCppStateMachineByName = cppStateMachineByName(getCppPointer(), name);
        if (jCppStateMachineByName == 0) {
            throw new StateMachineException(ja.f(JwtParser.SEPARATOR_CHAR, "No StateMachine found with name ", name));
        }
        StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByName, this.lock);
        getDependencies().add(stateMachineInstance);
        return stateMachineInstance;
    }

    public RiveTextValueRun textRun(String name, String path) throws TextValueRunException {
        name.getClass();
        path.getClass();
        long jCppFindTextValueRunAtPath = cppFindTextValueRunAtPath(getCppPointer(), name, path);
        if (jCppFindTextValueRunAtPath == 0) {
            throw new TextValueRunException(t40.l("No Rive TextValueRun found with name \"", name, ".\" in nested artboard ", path));
        }
        RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRunAtPath);
        getDependencies().add(riveTextValueRun);
        return riveTextValueRun;
    }

    public String getTextRunValue(String name) {
        name.getClass();
        return cppFindValueOfTextValueRun(getCppPointer(), name);
    }

    public void draw(long rendererAddress) {
        synchronized (this.lock) {
            cppDraw(getCppPointer(), rendererAddress);
            j6g j6gVar = j6g.a;
        }
    }

    public void setTextRunValue(String name, String textValue) throws TextValueRunException {
        name.getClass();
        textValue.getClass();
        if (!cppSetValueOfTextValueRun(getCppPointer(), name, textValue)) {
            throw new TextValueRunException(l5.m("Could not set text run. No Rive TextValueRun found with name \"", name, ".\""));
        }
    }

    public StateMachineInstance stateMachine(int index) throws StateMachineException {
        long jCppStateMachineByIndex = cppStateMachineByIndex(getCppPointer(), index);
        if (jCppStateMachineByIndex != 0) {
            StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByIndex, this.lock);
            getDependencies().add(stateMachineInstance);
            return stateMachineInstance;
        }
        throw new StateMachineException(bg.c(JwtParser.SEPARATOR_CHAR, index, "No StateMachine found at index "));
    }

    public RiveTextValueRun textRun(String name) throws TextValueRunException {
        name.getClass();
        long jCppFindTextValueRun = cppFindTextValueRun(getCppPointer(), name);
        if (jCppFindTextValueRun != 0) {
            RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRun);
            getDependencies().add(riveTextValueRun);
            return riveTextValueRun;
        }
        throw new TextValueRunException(l5.m("No Rive TextValueRun found with name \"", name, ".\""));
    }

    public LinearAnimationInstance animation(int index) throws AnimationException {
        long jCppAnimationByIndex = cppAnimationByIndex(getCppPointer(), index);
        if (jCppAnimationByIndex != 0) {
            LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByIndex, this.lock, 0.0f, 4, null);
            getDependencies().add(linearAnimationInstance);
            return linearAnimationInstance;
        }
        throw new AnimationException(bg.c(JwtParser.SEPARATOR_CHAR, index, "No Animation found at index "));
    }
}
