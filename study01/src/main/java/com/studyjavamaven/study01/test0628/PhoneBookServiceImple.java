/*
package test0628;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhoneBookServiceImple implements IPhoneBookService<IPhoneBook> {
    private List<IPhoneBook> list = new ArrayList<>();
    private final IPhoneBookRepository<IPhoneBook> phoneBookRepository;

    public PhoneBookServiceImple(String arg1, String fileName) throws Exception {
        if ("-j".equals(arg1)) {
            this.phoneBookRepository = new PhoneBookJsonRepository(fileName);
        } else if ("-t".equals(arg1)) {
            this.phoneBookRepository = new PhoneBookTextRepository(fileName);
        } else {
            throw new Exception("Error : You need program arguments (-j/-t) (filename) !");
        }
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public Long getMaxId() {
        return list.isEmpty() ? 1L : list.stream()
                .mapToLong(IPhoneBook::getId)
                .max()
                .orElse(0L) + 1;
    }

    @Override
    public IPhoneBook findById(Long id) {
        return list.stream()
                .filter(obj -> id.equals(obj.getId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<IPhoneBook> getAllList() {
        return this.list;
    }

    @Override
    public boolean insert(String name, EPhoneGroup group, String phoneNumber, String email) throws Exception {
        IPhoneBook phoneBook = PhoneBook.builder()
                .id(this.getMaxId())
                .name(name).group(group)
                .phoneNumber(phoneNumber).email(email).build();
        this.list.add(phoneBook);
        return true;
    }

    @Override
    public boolean insert(IPhoneBook phoneBook) throws Exception {
        this.list.add(phoneBook);
        return true;
    }

    @Override
    public boolean remove(Long id) {
        IPhoneBook find = this.findById(id);
        if (find != null) {
            this.list.remove(find);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Long id, IPhoneBook phoneBook) {
        int findIndex = this.findIndexById(id);
        if (findIndex >= 0) {
            phoneBook.setId(id);
            this.list.set(findIndex, phoneBook);
            return true;
        }
        return false;
    }

    private int findIndexById(Long id) {
        return IntStream.range(0, list.size())
                .filter(i -> id.equals(list.get(i).getId()))
                .findFirst()
                .orElse(-1);
    }

    @Override
    public List<IPhoneBook> getListFromName(String findName) {
        return list.stream()
                .filter(phoneBook -> phoneBook.getName().contains(findName))
                .collect(Collectors.toList());
    }

    @Override
    public List<IPhoneBook> getListFromGroup(EPhoneGroup phoneGroup) {
        return list.stream()
                .filter(phoneBook -> phoneGroup.equals(phoneBook.getGroup()))
                .collect(Collectors.toList());
    }

    @Override
    public List<IPhoneBook> getListFromPhoneNumber(String findPhone) {
        return list.stream()
                .filter(phoneBook -> phoneBook.getPhoneNumber().contains(findPhone))
                .collect(Collectors.toList());
    }

    @Override
    public List<IPhoneBook> getListFromEmail(String findEmail) {
        return list.stream()
                .filter(phoneBook -> phoneBook.getEmail().contains(findEmail))
                .collect(Collectors.toList());
    }

    @Override
    public boolean loadData() throws Exception {
        return this.phoneBookRepository.loadData(this.list);
    }

    @Override
    public boolean saveData() throws Exception {
        return this.phoneBookRepository.saveData(this.list);
    }
}
*/
