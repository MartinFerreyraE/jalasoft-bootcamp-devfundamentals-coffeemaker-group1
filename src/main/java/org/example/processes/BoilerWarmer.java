package org.example.processes;

import org.example.enums.OnOffSwitch;

public class BoilerWarmer {

    private OnOffSwitch onOffSwitch;

    public BoilerWarmer(OnOffSwitch onOffSwitch) {
        this.onOffSwitch = onOffSwitch;
    }

    public OnOffSwitch getOnOffSwitch() {
        return onOffSwitch;
    }

    public void setOnOffSwitch(OnOffSwitch onOffSwitch) {
        this.onOffSwitch = onOffSwitch;
    }

}
