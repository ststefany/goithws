public class DAOImpl implements DAO {

    //Methods print operation name and object which was used

    @Override
    public Room save(Room room) {
        System.out.println(room + " was saved");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room + " was deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room + "was updated");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println(id + " was found");
        return null;
    }
}
