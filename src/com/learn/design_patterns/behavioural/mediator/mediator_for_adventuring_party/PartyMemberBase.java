package com.learn.design_patterns.behavioural.mediator.mediator_for_adventuring_party;

public abstract class PartyMemberBase  implements PartyMember{

    private Party party;

    @Override
    public void joinParty(Party party) {
        System.out.println(this + " joins the party.");
        this.party = party;
    }
    @Override
    public void act(Action action) {
        if(party != null){
            System.out.println(this + " " + action);
            party.act(this, action);
        }

    }
    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }
    public abstract String toString();
}

class Rogue extends PartyMemberBase{
    @Override
    public String toString() {
        return "Rogue";
    }
}

class Wizard extends PartyMemberBase{
    @Override
    public String toString() {
        return "Wizard";
    }
}

class Hunter extends PartyMemberBase{
    @Override
    public String toString() {
        return "Hunter";
    }
}

class Hobbit extends PartyMemberBase{
    @Override
    public String toString() {
        return "Hobbit";
    }
}


