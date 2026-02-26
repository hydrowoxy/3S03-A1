
// This implementation assumes that Move() takes two arguments, one for type
// and one for position
// And also that passing is a valid move type that requires no position 
// argument

public class MockAgent implements CatanAgent {

    private int playerId;

    @Override
    public void init(int playerId) {
        this.playerId = playerId;
    }

    @Override
    public Move chooseInitialSettlement(GameState state) {
        return new Move("Settlement",0);
    }

    @Override
    public Move chooseInitialRoad(GameState state) {
        return new Move("Road",0);
    }

    @Override
    public Move chooseMove(GameState state) {
        return new Move("Pass");
    }

    @Override
    public Map<ResourceType, Integer> chooseDiscard(
            GameState state, int discardCount) {

        // Empty discard map for testing
        return new HashMap<>();
    }

    @Override
    public ResourceType chooseResource(GameState state) {
        return ResourceType.BRICK;
    }

    @Override
    public int chooseRobberTarget(
            GameState state, List<Integer> possibleTargets) {

        // Assuming for testing that possibleTargets is non-empty
        // and contains valid player IDs
        return possibleTargets.get(0);
    }

    @Override
    public DevelopmentCard chooseDevelopmentCard(GameState state) {
        return null;
    }
}
