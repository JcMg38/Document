package flight;

public interface FlightFactory extends Remote{
  public Flight getFlight(String flightNumber)throws RemoteException;
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java�����̾���>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
