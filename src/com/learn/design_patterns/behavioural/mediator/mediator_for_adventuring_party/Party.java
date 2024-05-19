package com.learn.design_patterns.behavioural.mediator.mediator_for_adventuring_party;

import java.util.ArrayList;
import java.util.List;

// This is the mediator class
public class Party {
    List<PartyMember> partyMembers;

    public Party() {
        this.partyMembers = new ArrayList<>();
    }

    public void act(PartyMember partyMember, Action action) {
        partyMembers.stream()
                .filter(member -> member != partyMember)
                .forEach(member -> member.partyAction(action));
    }

    public void join(PartyMember partyMember) {
        partyMembers.add(partyMember);
        partyMember.joinParty(this);
    }
}
